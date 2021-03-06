package com.efthymis.mandrill.api.rejects;

import java.util.Date;

import com.efthymis.mandrill.api.senders.MandrillSender;

/**
 * <p>Information for a rejection blacklist entry.</p>
 * @since Mar 18, 2013
 */
public class MandrillRejectsEntry {
	private String email, reason, detail;
	private Date created_at, last_event_at, expires_at;
	private Boolean expired;
	private MandrillSender sender;
	
	/**
	 * @return The email that is blocked.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return The type of event (hard-bounce, 
	 * soft-bounce, spam, unsub) that caused 
	 * this rejection.
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @return Extended details about the event, 
	 * such as the SMTP diagnostic for bounces or 
	 * the comment for manually-created rejections.
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * @return When this email was added to the 
	 * blacklist, UTC.
	 */
	public Date getCreatedAt() {
		return created_at;
	}
	/**
	 * @return The time of the most recent event 
	 * that either created or renewed this rejection.
	 */
	public Date getLastEventAt() {
		return last_event_at;
	}
	/**
	 * @return When this blacklist entry will 
	 * expire (this may be in the past), UTC.
	 */
	public Date getExpiresAt() {
		return expires_at;
	}
	/**
	 * @return Whether the blacklist entry has expired.
	 */
	public Boolean isExpired() {
		return expired;
	}
	/**
	 * @return The sender that this blacklist entry 
	 * applies to, or null if none.
	 */
	public MandrillSender getSender() {
		return sender;
	}
}
