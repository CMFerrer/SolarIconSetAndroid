package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.BookmarkCircle: ImageVector
    get() {
        if (_bookmarkCircle != null) {
            return _bookmarkCircle!!
        }
        _bookmarkCircle = Builder(
            name = "BookmarkCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(11.9424f, 6.25f)
                horizontalLineTo(12.0576f)
                curveTo(12.9512f, 6.25f, 13.7064f, 6.2499f, 14.3079f, 6.3419f)
                curveTo(14.9548f, 6.4408f, 15.5277f, 6.6595f, 15.9774f, 7.1709f)
                curveTo(16.4149f, 7.6684f, 16.5904f, 8.2787f, 16.6716f, 8.9651f)
                curveTo(16.75f, 9.6286f, 16.75f, 10.4695f, 16.75f, 11.5012f)
                verticalLineTo(14.0856f)
                curveTo(16.75f, 14.8256f, 16.75f, 15.4355f, 16.7059f, 15.9005f)
                curveTo(16.6635f, 16.3463f, 16.569f, 16.8583f, 16.2136f, 17.2268f)
                curveTo(15.9475f, 17.5026f, 15.5976f, 17.6895f, 15.2082f, 17.7396f)
                curveTo(14.6586f, 17.8104f, 14.2027f, 17.509f, 13.877f, 17.2494f)
                curveTo(13.5333f, 16.9756f, 13.1249f, 16.5691f, 12.6403f, 16.0869f)
                lineTo(12.6078f, 16.0546f)
                curveTo(12.371f, 15.8189f, 12.2302f, 15.6799f, 12.1181f, 15.5877f)
                curveTo(12.0629f, 15.5423f, 12.0325f, 15.5237f, 12.0207f, 15.5173f)
                curveTo(12.0069f, 15.5151f, 11.9931f, 15.5151f, 11.9793f, 15.5173f)
                curveTo(11.9675f, 15.5237f, 11.9371f, 15.5423f, 11.8819f, 15.5877f)
                curveTo(11.7698f, 15.6799f, 11.629f, 15.8189f, 11.3922f, 16.0546f)
                lineTo(11.3597f, 16.0869f)
                curveTo(10.8751f, 16.5691f, 10.4667f, 16.9756f, 10.123f, 17.2494f)
                curveTo(9.7973f, 17.509f, 9.3414f, 17.8104f, 8.7918f, 17.7396f)
                curveTo(8.4024f, 17.6895f, 8.0525f, 17.5026f, 7.7864f, 17.2268f)
                curveTo(7.431f, 16.8583f, 7.3365f, 16.3463f, 7.2941f, 15.9005f)
                curveTo(7.25f, 15.4355f, 7.25f, 14.8256f, 7.25f, 14.0856f)
                verticalLineTo(11.5012f)
                curveTo(7.25f, 10.4695f, 7.25f, 9.6286f, 7.3284f, 8.9651f)
                curveTo(7.4096f, 8.2787f, 7.5851f, 7.6684f, 8.0226f, 7.1709f)
                curveTo(8.4723f, 6.6595f, 9.0452f, 6.4408f, 9.6921f, 6.3419f)
                curveTo(10.2936f, 6.2499f, 11.0488f, 6.25f, 11.9424f, 6.25f)
                close()
                moveTo(11.9851f, 15.5144f)
                curveTo(11.9851f, 15.5144f, 11.9846f, 15.5147f, 11.9836f, 15.515f)
                close()
                moveTo(12.0149f, 15.5144f)
                curveTo(12.0149f, 15.5144f, 12.0154f, 15.5145f, 12.0164f, 15.515f)
                close()
                moveTo(9.9188f, 7.8246f)
                curveTo(9.4764f, 7.8923f, 9.2851f, 8.0066f, 9.149f, 8.1614f)
                curveTo(9.0007f, 8.3301f, 8.8833f, 8.5889f, 8.818f, 9.1412f)
                curveTo(8.7512f, 9.7062f, 8.75f, 10.4579f, 8.75f, 11.5488f)
                verticalLineTo(14.0455f)
                curveTo(8.75f, 14.8356f, 8.7508f, 15.3733f, 8.7874f, 15.7586f)
                curveTo(8.8187f, 16.0882f, 8.8688f, 16.1829f, 8.8729f, 16.1923f)
                curveTo(8.8986f, 16.2174f, 8.9235f, 16.2327f, 8.9452f, 16.2416f)
                curveTo(8.9808f, 16.224f, 9.0576f, 16.1804f, 9.1882f, 16.0763f)
                curveTo(9.4589f, 15.8606f, 9.8084f, 15.5144f, 10.3342f, 14.9913f)
                lineTo(10.3559f, 14.9697f)
                curveTo(10.5636f, 14.7629f, 10.7552f, 14.5723f, 10.929f, 14.4293f)
                curveTo(11.1163f, 14.2752f, 11.3449f, 14.1227f, 11.6388f, 14.0561f)
                curveTo(11.877f, 14.0021f, 12.123f, 14.0021f, 12.3612f, 14.0561f)
                curveTo(12.6551f, 14.1227f, 12.8837f, 14.2752f, 13.071f, 14.4293f)
                curveTo(13.2448f, 14.5723f, 13.4364f, 14.7629f, 13.6441f, 14.9697f)
                lineTo(13.6658f, 14.9913f)
                curveTo(14.1916f, 15.5144f, 14.5411f, 15.8606f, 14.8118f, 16.0763f)
                curveTo(14.9424f, 16.1804f, 15.0192f, 16.224f, 15.0548f, 16.2416f)
                curveTo(15.0765f, 16.2327f, 15.1014f, 16.2174f, 15.1272f, 16.1923f)
                curveTo(15.1312f, 16.1829f, 15.1813f, 16.0882f, 15.2126f, 15.7586f)
                curveTo(15.2492f, 15.3733f, 15.25f, 14.8356f, 15.25f, 14.0455f)
                verticalLineTo(11.5488f)
                curveTo(15.25f, 10.4579f, 15.2488f, 9.7062f, 15.182f, 9.1412f)
                curveTo(15.1167f, 8.5889f, 14.9993f, 8.3301f, 14.851f, 8.1614f)
                curveTo(14.7149f, 8.0066f, 14.5236f, 7.8923f, 14.0812f, 7.8246f)
                curveTo(13.6063f, 7.752f, 12.9668f, 7.75f, 12.0f, 7.75f)
                curveTo(11.0332f, 7.75f, 10.3937f, 7.752f, 9.9188f, 7.8246f)
                close()
            }
        }
            .build()
        return _bookmarkCircle!!
    }

private var _bookmarkCircle: ImageVector? = null
