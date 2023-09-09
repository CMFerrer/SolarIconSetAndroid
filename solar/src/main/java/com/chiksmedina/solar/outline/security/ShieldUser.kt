package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

public val SecurityGroup.ShieldUser: ImageVector
    get() {
        if (_shieldUser != null) {
            return _shieldUser!!
        }
        _shieldUser = Builder(name = "ShieldUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 9.0f)
                curveTo(9.25f, 7.4812f, 10.4812f, 6.25f, 12.0f, 6.25f)
                curveTo(13.5188f, 6.25f, 14.75f, 7.4812f, 14.75f, 9.0f)
                curveTo(14.75f, 10.5188f, 13.5188f, 11.75f, 12.0f, 11.75f)
                curveTo(10.4812f, 11.75f, 9.25f, 10.5188f, 9.25f, 9.0f)
                close()
                moveTo(12.0f, 7.75f)
                curveTo(11.3096f, 7.75f, 10.75f, 8.3096f, 10.75f, 9.0f)
                curveTo(10.75f, 9.6904f, 11.3096f, 10.25f, 12.0f, 10.25f)
                curveTo(12.6904f, 10.25f, 13.25f, 9.6904f, 13.25f, 9.0f)
                curveTo(13.25f, 8.3096f, 12.6904f, 7.75f, 12.0f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 12.25f)
                curveTo(10.8042f, 12.25f, 9.6846f, 12.4907f, 8.8362f, 12.915f)
                curveTo(8.0326f, 13.3168f, 7.25f, 14.0106f, 7.25f, 15.0f)
                lineTo(7.2499f, 15.0625f)
                curveTo(7.2483f, 15.5728f, 7.2458f, 16.4322f, 8.0602f, 17.0218f)
                curveTo(8.4382f, 17.2953f, 8.9369f, 17.4698f, 9.5547f, 17.581f)
                curveTo(10.1782f, 17.6932f, 10.9772f, 17.75f, 12.0f, 17.75f)
                curveTo(13.0228f, 17.75f, 13.8218f, 17.6932f, 14.4453f, 17.581f)
                curveTo(15.0631f, 17.4698f, 15.5618f, 17.2953f, 15.9398f, 17.0218f)
                curveTo(16.7542f, 16.4322f, 16.7517f, 15.5728f, 16.7501f, 15.0625f)
                lineTo(16.75f, 15.0f)
                curveTo(16.75f, 14.0106f, 15.9674f, 13.3168f, 15.1638f, 12.915f)
                curveTo(14.3154f, 12.4907f, 13.1958f, 12.25f, 12.0f, 12.25f)
                close()
                moveTo(8.75f, 15.0f)
                curveTo(8.75f, 14.8848f, 8.8629f, 14.5787f, 9.507f, 14.2566f)
                curveTo(10.1063f, 13.957f, 10.9866f, 13.75f, 12.0f, 13.75f)
                curveTo(13.0134f, 13.75f, 13.8937f, 13.957f, 14.493f, 14.2566f)
                curveTo(15.1371f, 14.5787f, 15.25f, 14.8848f, 15.25f, 15.0f)
                curveTo(15.25f, 15.6045f, 15.2115f, 15.6972f, 15.0602f, 15.8067f)
                curveTo(14.9382f, 15.895f, 14.6869f, 16.0134f, 14.1797f, 16.1047f)
                curveTo(13.6782f, 16.1949f, 12.9772f, 16.25f, 12.0f, 16.25f)
                curveTo(11.0228f, 16.25f, 10.3218f, 16.1949f, 9.8203f, 16.1047f)
                curveTo(9.3131f, 16.0134f, 9.0618f, 15.895f, 8.9398f, 15.8067f)
                curveTo(8.7885f, 15.6972f, 8.75f, 15.6045f, 8.75f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(12.0f, 2.75f)
                curveTo(11.3423f, 2.75f, 10.6951f, 2.9616f, 9.0806f, 3.5143f)
                lineTo(8.5078f, 3.7104f)
                curveTo(6.9952f, 4.2281f, 5.8921f, 4.6061f, 5.1176f, 4.9207f)
                curveTo(4.731f, 5.0777f, 4.4509f, 5.2094f, 4.2543f, 5.3235f)
                curveTo(4.1572f, 5.3799f, 4.0903f, 5.4264f, 4.0457f, 5.4627f)
                curveTo(4.0078f, 5.4935f, 3.9934f, 5.511f, 3.9913f, 5.5135f)
                curveTo(3.9894f, 5.5166f, 3.9769f, 5.5374f, 3.9594f, 5.5865f)
                curveTo(3.9394f, 5.6427f, 3.9173f, 5.7231f, 3.8957f, 5.8351f)
                curveTo(3.852f, 6.0617f, 3.8189f, 6.373f, 3.7961f, 6.7929f)
                curveTo(3.7503f, 7.6341f, 3.75f, 8.8083f, 3.75f, 10.4167f)
                verticalLineTo(11.9914f)
                curveTo(3.75f, 17.1665f, 7.6199f, 19.7135f, 10.1988f, 20.84f)
                curveTo(10.5703f, 21.0023f, 10.7848f, 21.0941f, 11.0236f, 21.1552f)
                curveTo(11.2517f, 21.2136f, 11.53f, 21.25f, 12.0f, 21.25f)
                curveTo(12.47f, 21.25f, 12.7483f, 21.2136f, 12.9764f, 21.1552f)
                curveTo(13.2152f, 21.0941f, 13.4297f, 21.0023f, 13.8012f, 20.84f)
                curveTo(16.3801f, 19.7135f, 20.25f, 17.1665f, 20.25f, 11.9914f)
                verticalLineTo(10.4167f)
                curveTo(20.25f, 8.8083f, 20.2497f, 7.6341f, 20.2039f, 6.7929f)
                curveTo(20.1811f, 6.373f, 20.148f, 6.0617f, 20.1043f, 5.8351f)
                curveTo(20.0827f, 5.7231f, 20.0606f, 5.6427f, 20.0406f, 5.5865f)
                curveTo(20.0231f, 5.5374f, 20.0106f, 5.5166f, 20.0087f, 5.5135f)
                curveTo(20.0066f, 5.5109f, 19.9922f, 5.4935f, 19.9543f, 5.4627f)
                curveTo(19.9097f, 5.4264f, 19.8428f, 5.3799f, 19.7457f, 5.3235f)
                curveTo(19.5491f, 5.2094f, 19.269f, 5.0777f, 18.8824f, 4.9207f)
                curveTo(18.1079f, 4.6061f, 17.0048f, 4.2281f, 15.4922f, 3.7104f)
                lineTo(14.9194f, 3.5143f)
                curveTo(13.3049f, 2.9616f, 12.6577f, 2.75f, 12.0f, 2.75f)
                close()
            }
        }
        .build()
        return _shieldUser!!
    }

private var _shieldUser: ImageVector? = null
