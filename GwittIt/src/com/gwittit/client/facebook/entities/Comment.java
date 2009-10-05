package com.gwittit.client.facebook.entities;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;

/*
 * Stream Comment
 * @see http://wiki.developers.facebook.com/index.php/Stream.getComments
 * @author olamar72 
 */
public class Comment {
	
	/*
	 * The external ID of the fb:comments being queried. You can specify more than one XID. 
	 */
	private String xid;
	
	/*
	 * The ID of the post in the stream. 
	 */
	private String postId;
	
	/*
	 * The user submitting a comment. 
	 */
	private Long fromId;
	
	/*
	 * A unix timestamp associated with the creation time of a comment. 
	 */
	private Date time;
	
	/*
	 * The text of a comment. 
	 */
	private String text;

	/*
	 * A unique ID for a given XID for each comment. 
	 */
	private Long id;
	
	/*
	 * The user name that a user entered when they posted a comment. In these cases, the fromid returned will be 0. Note that user names for valid users are not returned here. 
	 */
	private String username;
	
	/*
	 * The target XID for Feed stories generated by the user; applications can retrieve comments made to that story by calling this XID.
	 */
	private String replyXid;
	
	
	public Comment () {
		
	}
	
	public Comment ( JSONObject o ) {
		if ( o == null ) {
			GWT.log( "Comment: Null argument ", null );
		}
		
		
		GWT.log( Comment.class + ": create new comment object " + o , null );
		xid = JsonUtil.getString(o, "xid");
		postId = JsonUtil.getString(o, "post_id");
		fromId = JsonUtil.getLong(o, "fromid");
		time = JsonUtil.getDate(o, "time");
		text = JsonUtil.getString (o, "text");
		id = JsonUtil.getLong(o, "id");
		username = JsonUtil.getString(o, "username" );
		replyXid = JsonUtil.getString(o, "reply_xid");
		
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public Long getFromId() {
		return fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	public String getXid() {
		return xid;
	}

	public void setXid(String xid) {
		this.xid = xid;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getReplyXid() {
		return replyXid;
	}

	public void setReplyXid(String replyXid) {
		this.replyXid = replyXid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postId == null) ? 0 : postId.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (postId == null) {
			if (other.postId != null)
				return false;
		} else if (!postId.equals(other.postId))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	
	
	
}
