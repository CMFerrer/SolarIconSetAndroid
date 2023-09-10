package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.ShieldNetwork: ImageVector
    get() {
        if (_shieldNetwork != null) {
            return _shieldNetwork!!
        }
        _shieldNetwork = Builder(
            name = "ShieldNetwork", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.25f, 12.0f)
                curveTo(6.25f, 11.2449f, 6.3987f, 10.4972f, 6.6877f, 9.7996f)
                curveTo(6.9767f, 9.1019f, 7.4002f, 8.4681f, 7.9341f, 7.9341f)
                curveTo(8.4681f, 7.4002f, 9.1019f, 6.9767f, 9.7996f, 6.6877f)
                curveTo(10.4972f, 6.3987f, 11.2449f, 6.25f, 12.0f, 6.25f)
                curveTo(12.7551f, 6.25f, 13.5028f, 6.3987f, 14.2004f, 6.6877f)
                curveTo(14.8981f, 6.9767f, 15.5319f, 7.4002f, 16.0659f, 7.9341f)
                curveTo(16.5998f, 8.4681f, 17.0233f, 9.1019f, 17.3123f, 9.7996f)
                curveTo(17.6013f, 10.4972f, 17.75f, 11.2449f, 17.75f, 12.0f)
                curveTo(17.75f, 12.7551f, 17.6013f, 13.5028f, 17.3123f, 14.2004f)
                curveTo(17.0233f, 14.8981f, 16.5998f, 15.5319f, 16.0659f, 16.0659f)
                curveTo(15.5319f, 16.5998f, 14.8981f, 17.0233f, 14.2004f, 17.3123f)
                curveTo(13.5028f, 17.6013f, 12.7551f, 17.75f, 12.0f, 17.75f)
                curveTo(11.2449f, 17.75f, 10.4972f, 17.6013f, 9.7996f, 17.3123f)
                curveTo(9.1019f, 17.0233f, 8.4681f, 16.5998f, 7.9341f, 16.0659f)
                curveTo(7.4002f, 15.5319f, 6.9767f, 14.8981f, 6.6877f, 14.2004f)
                curveTo(6.3987f, 13.5028f, 6.25f, 12.7551f, 6.25f, 12.0f)
                close()
                moveTo(11.9438f, 7.7676f)
                curveTo(11.9785f, 7.7503f, 11.9956f, 7.75f, 12.0f, 7.75f)
                curveTo(12.0044f, 7.75f, 12.0215f, 7.7503f, 12.0562f, 7.7676f)
                curveTo(12.0936f, 7.7862f, 12.1518f, 7.8249f, 12.2259f, 7.9016f)
                curveTo(12.3786f, 8.0597f, 12.5539f, 8.3331f, 12.7179f, 8.743f)
                curveTo(12.8795f, 9.1471f, 13.0143f, 9.6443f, 13.1078f, 10.2092f)
                curveTo(13.1631f, 10.5427f, 13.2027f, 10.8921f, 13.2259f, 11.25f)
                horizontalLineTo(10.7741f)
                curveTo(10.7973f, 10.8921f, 10.8369f, 10.5427f, 10.8922f, 10.2092f)
                curveTo(10.9857f, 9.6443f, 11.1205f, 9.1471f, 11.2821f, 8.743f)
                curveTo(11.4461f, 8.3331f, 11.6214f, 8.0597f, 11.7741f, 7.9016f)
                curveTo(11.8482f, 7.8249f, 11.9064f, 7.7862f, 11.9438f, 7.7676f)
                close()
                moveTo(9.2713f, 11.25f)
                curveTo(9.2964f, 10.811f, 9.3436f, 10.379f, 9.4123f, 9.964f)
                curveTo(9.5089f, 9.3811f, 9.6479f, 8.8331f, 9.8274f, 8.3473f)
                curveTo(9.5247f, 8.5273f, 9.2449f, 8.7447f, 8.9948f, 8.9948f)
                curveTo(8.6002f, 9.3894f, 8.2871f, 9.858f, 8.0735f, 10.3736f)
                curveTo(7.9564f, 10.6563f, 7.8705f, 10.9502f, 7.8167f, 11.25f)
                horizontalLineTo(9.2713f)
                close()
                moveTo(7.8167f, 12.75f)
                horizontalLineTo(9.2713f)
                curveTo(9.2964f, 13.189f, 9.3436f, 13.621f, 9.4123f, 14.036f)
                curveTo(9.5089f, 14.6189f, 9.6479f, 15.1669f, 9.8274f, 15.6527f)
                curveTo(9.5247f, 15.4727f, 9.2449f, 15.2553f, 8.9948f, 15.0052f)
                curveTo(8.6002f, 14.6106f, 8.2871f, 14.142f, 8.0735f, 13.6264f)
                curveTo(7.9564f, 13.3437f, 7.8705f, 13.0498f, 7.8167f, 12.75f)
                close()
                moveTo(16.1833f, 11.25f)
                curveTo(16.1296f, 10.9502f, 16.0436f, 10.6563f, 15.9265f, 10.3736f)
                curveTo(15.7129f, 9.858f, 15.3999f, 9.3895f, 15.0052f, 8.9948f)
                curveTo(14.7551f, 8.7447f, 14.4753f, 8.5273f, 14.1726f, 8.3473f)
                curveTo(14.3521f, 8.8331f, 14.4911f, 9.3811f, 14.5877f, 9.964f)
                curveTo(14.6564f, 10.379f, 14.7036f, 10.811f, 14.7287f, 11.25f)
                horizontalLineTo(16.1833f)
                close()
                moveTo(14.7287f, 12.75f)
                horizontalLineTo(16.1833f)
                curveTo(16.1296f, 13.0498f, 16.0436f, 13.3437f, 15.9265f, 13.6264f)
                curveTo(15.7129f, 14.142f, 15.3999f, 14.6106f, 15.0052f, 15.0052f)
                curveTo(14.7551f, 15.2553f, 14.4753f, 15.4727f, 14.1726f, 15.6527f)
                curveTo(14.3521f, 15.1669f, 14.4911f, 14.6189f, 14.5877f, 14.036f)
                curveTo(14.6564f, 13.621f, 14.7036f, 13.189f, 14.7287f, 12.75f)
                close()
                moveTo(13.2259f, 12.75f)
                curveTo(13.2027f, 13.1079f, 13.1631f, 13.4573f, 13.1078f, 13.7908f)
                curveTo(13.0143f, 14.3557f, 12.8795f, 14.8529f, 12.7179f, 15.257f)
                curveTo(12.5539f, 15.6669f, 12.3786f, 15.9403f, 12.2259f, 16.0984f)
                curveTo(12.1518f, 16.1751f, 12.0936f, 16.2138f, 12.0562f, 16.2324f)
                curveTo(12.0215f, 16.2497f, 12.0044f, 16.25f, 12.0f, 16.25f)
                curveTo(11.9956f, 16.25f, 11.9785f, 16.2497f, 11.9438f, 16.2324f)
                curveTo(11.9064f, 16.2138f, 11.8482f, 16.1751f, 11.7741f, 16.0984f)
                curveTo(11.6214f, 15.9403f, 11.4461f, 15.6669f, 11.2821f, 15.257f)
                curveTo(11.1205f, 14.8529f, 10.9857f, 14.3557f, 10.8922f, 13.7908f)
                curveTo(10.8369f, 13.4573f, 10.7973f, 13.1079f, 10.7741f, 12.75f)
                horizontalLineTo(13.2259f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(11.0625f, 1.25f, 10.1673f, 1.5566f, 8.7234f, 2.0511f)
                lineTo(7.996f, 2.3001f)
                curveTo(6.5146f, 2.8072f, 5.3714f, 3.1985f, 4.553f, 3.531f)
                curveTo(4.1408f, 3.6985f, 3.7864f, 3.8607f, 3.501f, 4.0264f)
                curveTo(3.2263f, 4.1859f, 2.9508f, 4.3848f, 2.7636f, 4.6515f)
                curveTo(2.5786f, 4.9152f, 2.4829f, 5.2392f, 2.4228f, 5.5512f)
                curveTo(2.3603f, 5.8756f, 2.3226f, 6.2646f, 2.2983f, 6.7114f)
                curveTo(2.25f, 7.5984f, 2.25f, 8.8135f, 2.25f, 10.3896f)
                verticalLineTo(11.9914f)
                curveTo(2.25f, 18.0924f, 6.858f, 21.0175f, 9.5983f, 22.2146f)
                lineTo(9.6254f, 22.2264f)
                curveTo(9.9652f, 22.3749f, 10.2846f, 22.5144f, 10.6516f, 22.6084f)
                curveTo(11.0391f, 22.7076f, 11.4507f, 22.75f, 12.0f, 22.75f)
                curveTo(12.5493f, 22.75f, 12.9609f, 22.7076f, 13.3484f, 22.6084f)
                curveTo(13.7154f, 22.5144f, 14.0348f, 22.3749f, 14.3745f, 22.2264f)
                lineTo(14.4017f, 22.2146f)
                curveTo(17.142f, 21.0175f, 21.75f, 18.0924f, 21.75f, 11.9914f)
                verticalLineTo(10.3898f)
                curveTo(21.75f, 8.8136f, 21.75f, 7.5984f, 21.7017f, 6.7114f)
                curveTo(21.6774f, 6.2646f, 21.6397f, 5.8756f, 21.5772f, 5.5512f)
                curveTo(21.5171f, 5.2392f, 21.4214f, 4.9152f, 21.2364f, 4.6515f)
                curveTo(21.0492f, 4.3848f, 20.7737f, 4.1859f, 20.499f, 4.0264f)
                curveTo(20.2136f, 3.8607f, 19.8592f, 3.6985f, 19.447f, 3.531f)
                curveTo(18.6286f, 3.1985f, 17.4854f, 2.8072f, 16.004f, 2.3001f)
                lineTo(15.2766f, 2.0511f)
                curveTo(13.8327f, 1.5566f, 12.9375f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(9.0806f, 3.5143f)
                curveTo(10.6951f, 2.9616f, 11.3423f, 2.75f, 12.0f, 2.75f)
                curveTo(12.6577f, 2.75f, 13.3049f, 2.9616f, 14.9194f, 3.5143f)
                lineTo(15.4922f, 3.7104f)
                curveTo(17.0048f, 4.2281f, 18.1079f, 4.6061f, 18.8824f, 4.9207f)
                curveTo(19.269f, 5.0777f, 19.5491f, 5.2094f, 19.7457f, 5.3235f)
                curveTo(19.8428f, 5.3799f, 19.9097f, 5.4264f, 19.9543f, 5.4627f)
                curveTo(19.9922f, 5.4935f, 20.0066f, 5.5109f, 20.0087f, 5.5135f)
                curveTo(20.0106f, 5.5166f, 20.0231f, 5.5374f, 20.0406f, 5.5865f)
                curveTo(20.0606f, 5.6427f, 20.0827f, 5.7231f, 20.1043f, 5.8351f)
                curveTo(20.148f, 6.0617f, 20.1811f, 6.373f, 20.2039f, 6.7929f)
                curveTo(20.2497f, 7.6341f, 20.25f, 8.8083f, 20.25f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(20.25f, 17.1665f, 16.3801f, 19.7135f, 13.8012f, 20.84f)
                curveTo(13.4297f, 21.0023f, 13.2152f, 21.0941f, 12.9764f, 21.1552f)
                curveTo(12.7483f, 21.2136f, 12.47f, 21.25f, 12.0f, 21.25f)
                curveTo(11.53f, 21.25f, 11.2517f, 21.2136f, 11.0236f, 21.1552f)
                curveTo(10.7848f, 21.0941f, 10.5703f, 21.0023f, 10.1988f, 20.84f)
                curveTo(7.6199f, 19.7135f, 3.75f, 17.1665f, 3.75f, 11.9914f)
                verticalLineTo(10.4167f)
                curveTo(3.75f, 8.8083f, 3.7503f, 7.6341f, 3.7961f, 6.7929f)
                curveTo(3.8189f, 6.373f, 3.852f, 6.0617f, 3.8957f, 5.8351f)
                curveTo(3.9173f, 5.7231f, 3.9394f, 5.6427f, 3.9594f, 5.5865f)
                curveTo(3.9769f, 5.5374f, 3.9894f, 5.5166f, 3.9913f, 5.5135f)
                curveTo(3.9934f, 5.511f, 4.0078f, 5.4935f, 4.0457f, 5.4627f)
                curveTo(4.0903f, 5.4264f, 4.1572f, 5.3799f, 4.2543f, 5.3235f)
                curveTo(4.4509f, 5.2094f, 4.731f, 5.0777f, 5.1176f, 4.9207f)
                curveTo(5.8921f, 4.6061f, 6.9952f, 4.2281f, 8.5078f, 3.7104f)
                lineTo(9.0806f, 3.5143f)
                close()
            }
        }
            .build()
        return _shieldNetwork!!
    }

private var _shieldNetwork: ImageVector? = null
