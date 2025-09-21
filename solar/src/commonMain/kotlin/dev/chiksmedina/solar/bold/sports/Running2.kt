package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Running2: ImageVector
    get() {
        if (_running2 != null) {
            return _running2!!
        }
        _running2 = Builder(
            name = "Running2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.75f, 4.5f)
                curveTo(20.75f, 5.8807f, 19.6307f, 7.0f, 18.25f, 7.0f)
                curveTo(16.8693f, 7.0f, 15.75f, 5.8807f, 15.75f, 4.5f)
                curveTo(15.75f, 3.1193f, 16.8693f, 2.0f, 18.25f, 2.0f)
                curveTo(19.6307f, 2.0f, 20.75f, 3.1193f, 20.75f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.4366f, 6.6613f)
                lineTo(13.4421f, 6.6636f)
                curveTo(14.6265f, 7.1511f, 15.6111f, 8.045f, 16.1889f, 9.2008f)
                curveTo(16.8169f, 10.4567f, 18.1005f, 11.25f, 19.5046f, 11.25f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 11.25f, 21.5f, 11.5858f, 21.5f, 12.0f)
                curveTo(21.5f, 12.4142f, 21.1642f, 12.75f, 20.75f, 12.75f)
                horizontalLineTo(19.5046f)
                curveTo(17.5323f, 12.75f, 15.7293f, 11.6357f, 14.8473f, 9.8716f)
                curveTo(14.4364f, 9.0499f, 13.7311f, 8.4047f, 12.8711f, 8.0507f)
                curveTo(11.5075f, 7.4894f, 11.0748f, 7.331f, 10.2511f, 7.3909f)
                curveTo(9.1085f, 7.474f, 8.0581f, 8.0512f, 5.5562f, 9.4727f)
                lineTo(4.1205f, 10.2884f)
                curveTo(3.7604f, 10.4931f, 3.3025f, 10.367f, 3.0979f, 10.0069f)
                curveTo(2.8933f, 9.6467f, 3.0194f, 9.1889f, 3.3795f, 8.9843f)
                lineTo(4.8152f, 8.1685f)
                curveTo(4.8731f, 8.1356f, 4.9305f, 8.103f, 4.9874f, 8.0707f)
                curveTo(7.2611f, 6.7783f, 8.6208f, 6.0055f, 10.1424f, 5.8948f)
                curveTo(11.3595f, 5.8063f, 12.096f, 6.1095f, 13.4366f, 6.6613f)
                close()
                moveTo(13.3046f, 10.4956f)
                curveTo(13.5833f, 10.8021f, 13.5607f, 11.2765f, 13.2542f, 11.5551f)
                curveTo(13.0746f, 11.7184f, 12.8955f, 11.8778f, 12.7203f, 12.0338f)
                curveTo(12.4396f, 12.2837f, 12.1689f, 12.5247f, 11.9223f, 12.7582f)
                curveTo(11.7268f, 12.9432f, 11.5672f, 13.1045f, 11.4508f, 13.2386f)
                curveTo(11.3568f, 13.3469f, 11.3189f, 13.4064f, 11.3077f, 13.424f)
                curveTo(11.3032f, 13.431f, 11.303f, 13.4313f, 11.3052f, 13.4254f)
                curveTo(11.1878f, 13.742f, 11.2035f, 14.0927f, 11.3487f, 14.3976f)
                curveTo(11.3911f, 14.4866f, 11.4785f, 14.6084f, 11.712f, 14.8163f)
                curveTo(11.9497f, 15.0279f, 12.28f, 15.2787f, 12.7674f, 15.6481f)
                curveTo(12.7925f, 15.6671f, 12.8173f, 15.6858f, 12.8417f, 15.7043f)
                curveTo(13.4028f, 16.1291f, 13.7908f, 16.4228f, 14.0862f, 16.7946f)
                curveTo(14.4141f, 17.2075f, 14.6514f, 17.6848f, 14.7824f, 18.1955f)
                curveTo(14.9004f, 18.6555f, 14.9002f, 19.1421f, 14.9f, 19.8459f)
                curveTo(14.9f, 19.8765f, 14.9f, 19.9076f, 14.9f, 19.939f)
                verticalLineTo(22.0f)
                curveTo(14.9f, 22.4142f, 14.5642f, 22.75f, 14.15f, 22.75f)
                curveTo(13.7358f, 22.75f, 13.4f, 22.4142f, 13.4f, 22.0f)
                verticalLineTo(19.939f)
                curveTo(13.4f, 19.1064f, 13.3945f, 18.8218f, 13.3294f, 18.5682f)
                curveTo(13.2508f, 18.2618f, 13.1085f, 17.9754f, 12.9117f, 17.7277f)
                curveTo(12.7489f, 17.5228f, 12.5253f, 17.3465f, 11.8617f, 16.8437f)
                lineTo(11.8375f, 16.8254f)
                curveTo(11.3803f, 16.479f, 11.0021f, 16.1925f, 10.7147f, 15.9367f)
                curveTo(10.418f, 15.6727f, 10.1617f, 15.3936f, 9.9946f, 15.0428f)
                curveTo(9.675f, 14.372f, 9.6405f, 13.6005f, 9.8988f, 12.9038f)
                curveTo(9.9912f, 12.6546f, 10.1693f, 12.4267f, 10.3178f, 12.2556f)
                curveTo(10.4814f, 12.067f, 10.6818f, 11.8669f, 10.8912f, 11.6688f)
                curveTo(11.1504f, 11.4234f, 11.4563f, 11.1508f, 11.7524f, 10.887f)
                curveTo(11.9236f, 10.7345f, 12.0915f, 10.5849f, 12.2452f, 10.4452f)
                curveTo(12.5517f, 10.1666f, 13.026f, 10.1891f, 13.3046f, 10.4956f)
                close()
                moveTo(9.2301f, 16.4238f)
                curveTo(9.5484f, 16.689f, 9.5913f, 17.1619f, 9.3262f, 17.4801f)
                lineTo(8.3254f, 18.6811f)
                curveTo(8.2928f, 18.7202f, 8.2607f, 18.7588f, 8.2289f, 18.7969f)
                curveTo(7.5869f, 19.5685f, 7.1156f, 20.135f, 6.4576f, 20.4432f)
                curveTo(5.7996f, 20.7513f, 5.0627f, 20.7508f, 4.0589f, 20.7501f)
                curveTo(4.0093f, 20.75f, 3.959f, 20.75f, 3.9081f, 20.75f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 20.75f, 2.0f, 20.4142f, 2.0f, 20.0f)
                curveTo(2.0f, 19.5858f, 2.3358f, 19.25f, 2.75f, 19.25f)
                horizontalLineTo(3.9081f)
                curveTo(5.1297f, 19.25f, 5.504f, 19.2334f, 5.8213f, 19.0848f)
                curveTo(6.1387f, 18.9361f, 6.391f, 18.6593f, 7.1731f, 17.7208f)
                lineTo(8.1738f, 16.5199f)
                curveTo(8.439f, 16.2017f, 8.9119f, 16.1587f, 9.2301f, 16.4238f)
                close()
            }
        }
            .build()
        return _running2!!
    }

private var _running2: ImageVector? = null
