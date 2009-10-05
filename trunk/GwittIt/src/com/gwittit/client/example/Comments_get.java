package com.gwittit.client.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwittit.client.facebook.entities.Comment;
import com.gwittit.client.facebook.ui.CommentUi;
import com.gwittit.client.facebook.ui.CommentUi.DeleteHandler;
import com.gwittit.client.facebook.xfbml.Xfbml;

/**
 * Method comments.get
 */
public class Comments_get extends Example {
	
	public static final String XID = "comments_test";
	
	static String method = "comments.get";
	
	public Comments_get () {
		super ( method );
	}

	/**
	 * Create widget
	 */
	@Override
	public Widget createWidget () {
		final VerticalPanel outer = new VerticalPanel ();
		outer.getElement().setId(method);
		addLoader ( outer );
		
		Map<String,String> params = new HashMap<String,String> ();
		params.put( "xid", XID );

		// Get facebook data
		apiClient.comments_get(params, new AsyncCallback<List<Comment>> () {

			public void onFailure(Throwable caught) {
				handleFailure ( caught );
			}

			public void onSuccess(List<Comment> result) {
				removeLoader ( outer );
				outer.add ( new HTML ( "Comments size " + result.size() ) );
				
				// OUh a little messy
				for ( Comment comment: result ) {
					final CommentUi ui = new CommentUi ( comment );
					outer.add ( ui );
					
					ui.addDeleteHandler(new DeleteHandler () {

						public void onDelete(Long id) {
							Map<String,String> params = new HashMap<String,String> ();
							params.put ( "comment_id", ""+id );
							params.put("xid", XID);
							
							apiClient.comments_remove(params, new AsyncCallback<JSONValue> () {
								public void onFailure(Throwable caught) {
									handleFailure ( caught );
								}
								public void onSuccess(JSONValue result) {
									outer.remove ( ui );
								}
							});
									
						} 
						
					});
					
					Xfbml.parse(outer);
						
				}
			}
			
		});
		return outer;
	}

	
}
