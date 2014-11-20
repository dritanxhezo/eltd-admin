package com.vintek.database.model.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserTest {

	public UserTest() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
/*
	@Test
	public void testUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetActivatedOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetActivatedOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBroadcastMessageID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBroadcastMessageID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBroadcastMessageSetting() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBroadcastMessageSetting() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetChangeDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetChangeDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetChangePassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetChangePassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCreatedBy() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCreatedBy() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCreatedOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCreatedOn() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDefaultOrgID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDefaultOrgID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDefaultSearchType() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDefaultSearchType() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDeleted() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDeleted() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEnabled() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetExpirationDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetExpirationDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetExtension() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetExtension() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFailedLogins() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFailedLogins() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFax() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFax() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGroupID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGroupID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLastLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLastLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMisc() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMisc() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrgSpecificPermissions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOrgSpecificPermissions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPassword() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPasswordChangeDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPasswordChangeDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPasswordEnc() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPasswordEnc() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPhone() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPhone() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPin() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSalesAssociateID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSalesAssociateID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetServiceCenter() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetServiceCenter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTheme() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTheme() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTimeZone() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTimeZone() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetToken() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetToken() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTrainingVidExp() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTrainingVidExp() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTrainingVidStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTrainingVidStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTransactionID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTransactionID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserID() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUserID() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserPermissions() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUserPermissions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserRecentDocuments() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetUserRecentDocuments() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrganizations() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetOrganizations() {
		fail("Not yet implemented");
	}
*/
}
