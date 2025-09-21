package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.BatteryLowMinimalistic: ImageVector
    get() {
        if (_batteryLowMinimalistic != null) {
            return _batteryLowMinimalistic!!
        }
        _batteryLowMinimalistic = Builder(
            name = "BatteryLowMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(11.5f)
                curveTo(15.2712f, 20.0f, 17.1569f, 20.0f, 18.3284f, 18.8284f)
                curveTo(19.5f, 17.6569f, 19.5f, 15.7712f, 19.5f, 12.0f)
                curveTo(19.5f, 8.2288f, 19.5f, 6.3432f, 18.3284f, 5.1716f)
                curveTo(17.1569f, 4.0f, 15.2712f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.25f, 14.0f)
                curveTo(21.25f, 14.4142f, 21.5858f, 14.75f, 22.0f, 14.75f)
                curveTo(22.4142f, 14.75f, 22.75f, 14.4142f, 22.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 9.5858f, 22.4142f, 9.25f, 22.0f, 9.25f)
                curveTo(21.5858f, 9.25f, 21.25f, 9.5858f, 21.25f, 10.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6359f, 8.3445f)
                curveTo(6.998f, 8.1434f, 7.4546f, 8.2738f, 7.6557f, 8.6359f)
                lineTo(7.0001f, 9.0001f)
                curveTo(7.6557f, 8.6359f, 7.6565f, 8.6372f, 7.6565f, 8.6372f)
                lineTo(7.6572f, 8.6386f)
                lineTo(7.6589f, 8.6417f)
                lineTo(7.6628f, 8.6488f)
                lineTo(7.6724f, 8.6671f)
                curveTo(7.6796f, 8.6812f, 7.6885f, 8.6989f, 7.6988f, 8.7205f)
                curveTo(7.7193f, 8.7635f, 7.7452f, 8.8215f, 7.7746f, 8.895f)
                curveTo(7.8335f, 9.0422f, 7.9061f, 9.2511f, 7.9766f, 9.5264f)
                curveTo(8.1179f, 10.0773f, 8.2501f, 10.89f, 8.2501f, 12.0001f)
                curveTo(8.2501f, 13.1103f, 8.1179f, 13.923f, 7.9766f, 14.4739f)
                curveTo(7.9061f, 14.7491f, 7.8335f, 14.9581f, 7.7746f, 15.1052f)
                curveTo(7.7452f, 15.1788f, 7.7193f, 15.2368f, 7.6988f, 15.2798f)
                curveTo(7.6885f, 15.3013f, 7.6796f, 15.3191f, 7.6724f, 15.3331f)
                lineTo(7.6628f, 15.3515f)
                lineTo(7.6589f, 15.3586f)
                lineTo(7.6572f, 15.3617f)
                lineTo(7.6565f, 15.3631f)
                lineTo(7.6557f, 15.3644f)
                curveTo(7.4546f, 15.7265f, 6.998f, 15.8569f, 6.6359f, 15.6558f)
                curveTo(6.2769f, 15.4563f, 6.1456f, 15.0057f, 6.3395f, 14.6451f)
                lineTo(6.3445f, 14.6349f)
                curveTo(6.3513f, 14.6205f, 6.3644f, 14.5918f, 6.3819f, 14.5482f)
                curveTo(6.4168f, 14.4609f, 6.4692f, 14.3136f, 6.5236f, 14.1014f)
                curveTo(6.6324f, 13.6773f, 6.7501f, 12.99f, 6.7501f, 12.0001f)
                curveTo(6.7501f, 11.0103f, 6.6324f, 10.323f, 6.5236f, 9.8989f)
                curveTo(6.4692f, 9.6866f, 6.4168f, 9.5393f, 6.3819f, 9.4521f)
                curveTo(6.3644f, 9.4085f, 6.3513f, 9.3798f, 6.3445f, 9.3654f)
                lineTo(6.3395f, 9.3551f)
                curveTo(6.1456f, 8.9945f, 6.2769f, 8.544f, 6.6359f, 8.3445f)
                close()
            }
        }
            .build()
        return _batteryLowMinimalistic!!
    }

private var _batteryLowMinimalistic: ImageVector? = null
