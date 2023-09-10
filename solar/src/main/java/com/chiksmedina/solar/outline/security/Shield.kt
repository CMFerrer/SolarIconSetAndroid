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

val SecurityGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(
            name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.7234f, 2.0511f)
                curveTo(10.1673f, 1.5566f, 11.0625f, 1.25f, 12.0f, 1.25f)
                curveTo(12.9375f, 1.25f, 13.8327f, 1.5566f, 15.2766f, 2.0511f)
                lineTo(16.004f, 2.3001f)
                curveTo(17.4854f, 2.8072f, 18.6286f, 3.1985f, 19.447f, 3.531f)
                curveTo(19.8592f, 3.6985f, 20.2136f, 3.8607f, 20.499f, 4.0264f)
                curveTo(20.7737f, 4.1859f, 21.0492f, 4.3848f, 21.2364f, 4.6515f)
                curveTo(21.4214f, 4.9152f, 21.5171f, 5.2392f, 21.5772f, 5.5512f)
                curveTo(21.6397f, 5.8756f, 21.6774f, 6.2646f, 21.7017f, 6.7114f)
                curveTo(21.75f, 7.5984f, 21.75f, 8.8136f, 21.75f, 10.3898f)
                verticalLineTo(11.9914f)
                curveTo(21.75f, 18.0924f, 17.142f, 21.0175f, 14.4017f, 22.2146f)
                lineTo(14.3746f, 22.2264f)
                curveTo(14.0348f, 22.3749f, 13.7154f, 22.5144f, 13.3484f, 22.6084f)
                curveTo(12.9609f, 22.7076f, 12.5493f, 22.75f, 12.0f, 22.75f)
                curveTo(11.4507f, 22.75f, 11.0391f, 22.7076f, 10.6516f, 22.6084f)
                curveTo(10.2846f, 22.5144f, 9.9652f, 22.3749f, 9.6254f, 22.2264f)
                lineTo(9.5983f, 22.2146f)
                curveTo(6.858f, 21.0175f, 2.25f, 18.0924f, 2.25f, 11.9914f)
                verticalLineTo(10.3899f)
                curveTo(2.25f, 8.8138f, 2.25f, 7.5984f, 2.2983f, 6.7114f)
                curveTo(2.3226f, 6.2646f, 2.3603f, 5.8756f, 2.4228f, 5.5512f)
                curveTo(2.4829f, 5.2392f, 2.5786f, 4.9152f, 2.7636f, 4.6515f)
                curveTo(2.9508f, 4.3848f, 3.2263f, 4.1859f, 3.501f, 4.0264f)
                curveTo(3.7864f, 3.8607f, 4.1408f, 3.6985f, 4.553f, 3.531f)
                curveTo(5.3714f, 3.1985f, 6.5146f, 2.8072f, 7.996f, 2.3001f)
                lineTo(8.7234f, 2.0511f)
                close()
                moveTo(11.25f, 2.8379f)
                curveTo(10.7525f, 2.946f, 10.1152f, 3.1602f, 9.0806f, 3.5143f)
                lineTo(8.5078f, 3.7104f)
                curveTo(6.9952f, 4.2281f, 5.8921f, 4.6061f, 5.1176f, 4.9207f)
                curveTo(4.731f, 5.0777f, 4.4509f, 5.2094f, 4.2543f, 5.3235f)
                curveTo(4.1572f, 5.3799f, 4.0903f, 5.4264f, 4.0457f, 5.4627f)
                curveTo(4.0078f, 5.4935f, 3.9934f, 5.511f, 3.9913f, 5.5135f)
                curveTo(3.9894f, 5.5166f, 3.9769f, 5.5374f, 3.9594f, 5.5865f)
                curveTo(3.9394f, 5.6427f, 3.9173f, 5.7231f, 3.8957f, 5.8351f)
                curveTo(3.852f, 6.0617f, 3.8189f, 6.373f, 3.7961f, 6.7929f)
                curveTo(3.7547f, 7.5523f, 3.7505f, 8.583f, 3.7501f, 9.9594f)
                lineTo(11.25f, 7.4594f)
                verticalLineTo(2.8379f)
                close()
                moveTo(12.75f, 2.8379f)
                verticalLineTo(7.4594f)
                lineTo(20.25f, 9.9594f)
                curveTo(20.2495f, 8.583f, 20.2453f, 7.5523f, 20.2039f, 6.7929f)
                curveTo(20.1811f, 6.373f, 20.148f, 6.0617f, 20.1043f, 5.8351f)
                curveTo(20.0827f, 5.7231f, 20.0606f, 5.6427f, 20.0406f, 5.5865f)
                curveTo(20.0231f, 5.5374f, 20.0106f, 5.5166f, 20.0087f, 5.5135f)
                curveTo(20.0066f, 5.5109f, 19.9922f, 5.4935f, 19.9543f, 5.4627f)
                curveTo(19.9097f, 5.4264f, 19.8428f, 5.3799f, 19.7457f, 5.3235f)
                curveTo(19.5491f, 5.2094f, 19.269f, 5.0777f, 18.8824f, 4.9207f)
                curveTo(18.1079f, 4.6061f, 17.0048f, 4.2281f, 15.4922f, 3.7104f)
                lineTo(14.9194f, 3.5143f)
                curveTo(13.8848f, 3.1602f, 13.2475f, 2.946f, 12.75f, 2.8379f)
                close()
                moveTo(11.25f, 9.0406f)
                lineTo(3.75f, 11.5406f)
                verticalLineTo(11.9914f)
                curveTo(3.75f, 17.1665f, 7.6199f, 19.7135f, 10.1988f, 20.84f)
                curveTo(10.5703f, 21.0023f, 10.7848f, 21.0941f, 11.0236f, 21.1552f)
                curveTo(11.0931f, 21.173f, 11.1672f, 21.1888f, 11.25f, 21.2021f)
                verticalLineTo(9.0406f)
                close()
                moveTo(12.75f, 21.2021f)
                verticalLineTo(9.0406f)
                lineTo(20.25f, 11.5406f)
                verticalLineTo(11.9914f)
                curveTo(20.25f, 17.1665f, 16.3801f, 19.7135f, 13.8012f, 20.84f)
                curveTo(13.4297f, 21.0023f, 13.2152f, 21.0941f, 12.9764f, 21.1552f)
                curveTo(12.9069f, 21.173f, 12.8328f, 21.1888f, 12.75f, 21.2021f)
                close()
            }
        }
            .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
