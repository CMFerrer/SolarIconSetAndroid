package dev.chiksmedina.solar.boldduotone.electronicdevices

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
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartphoneRotateAngle: ImageVector
    get() {
        if (_smartphoneRotateAngle != null) {
            return _smartphoneRotateAngle!!
        }
        _smartphoneRotateAngle = Builder(
            name = "SmartphoneRotateAngle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.6273f, 14.5343f)
                curveTo(3.8846f, 14.8589f, 3.8299f, 15.3306f, 3.5052f, 15.5879f)
                curveTo(2.9316f, 16.0424f, 2.75f, 16.443f, 2.75f, 16.75f)
                curveTo(2.75f, 17.0165f, 2.8841f, 17.3495f, 3.2969f, 17.7337f)
                curveTo(3.7107f, 18.119f, 4.3504f, 18.5004f, 5.2037f, 18.8364f)
                curveTo(6.4142f, 19.313f, 7.9789f, 19.6686f, 9.75f, 19.8343f)
                verticalLineTo(19.375f)
                curveTo(9.75f, 19.0807f, 9.9221f, 18.8137f, 10.1901f, 18.6921f)
                curveTo(10.4581f, 18.5705f, 10.7724f, 18.6168f, 10.9939f, 18.8106f)
                lineTo(12.4939f, 20.1231f)
                curveTo(12.6566f, 20.2655f, 12.75f, 20.4713f, 12.75f, 20.6875f)
                curveTo(12.75f, 20.9038f, 12.6566f, 21.1095f, 12.4939f, 21.252f)
                lineTo(10.9939f, 22.5645f)
                curveTo(10.7724f, 22.7582f, 10.4581f, 22.8046f, 10.1901f, 22.683f)
                curveTo(9.9221f, 22.5614f, 9.75f, 22.2943f, 9.75f, 22.0f)
                verticalLineTo(21.3404f)
                curveTo(7.8058f, 21.1699f, 6.0497f, 20.7816f, 4.6542f, 20.2321f)
                curveTo(3.6978f, 19.8555f, 2.873f, 19.3885f, 2.2748f, 18.8316f)
                curveTo(1.6755f, 18.2737f, 1.25f, 17.5709f, 1.25f, 16.75f)
                curveTo(1.25f, 15.7998f, 1.8167f, 15.012f, 2.5737f, 14.4122f)
                curveTo(2.8984f, 14.1549f, 3.3701f, 14.2096f, 3.6273f, 14.5343f)
                close()
                moveTo(20.3727f, 14.5343f)
                curveTo(20.6299f, 14.2096f, 21.1016f, 14.1549f, 21.4263f, 14.4122f)
                curveTo(22.1833f, 15.012f, 22.75f, 15.7998f, 22.75f, 16.75f)
                curveTo(22.75f, 18.1281f, 21.5819f, 19.1606f, 20.2034f, 19.8514f)
                curveTo(18.7617f, 20.5738f, 16.791f, 21.0851f, 14.5756f, 21.3097f)
                curveTo(14.1635f, 21.3514f, 13.7956f, 21.0512f, 13.7538f, 20.6391f)
                curveTo(13.7121f, 20.227f, 14.0123f, 19.8591f, 14.4244f, 19.8173f)
                curveTo(16.522f, 19.6047f, 18.3014f, 19.1267f, 19.5314f, 18.5103f)
                curveTo(20.8246f, 17.8623f, 21.25f, 17.2067f, 21.25f, 16.75f)
                curveTo(21.25f, 16.443f, 21.0684f, 16.0424f, 20.4948f, 15.5879f)
                curveTo(20.1701f, 15.3306f, 20.1155f, 14.8589f, 20.3727f, 14.5343f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 19.0f, 14.8431f, 21.0f, 12.0f, 21.0f)
                curveTo(9.1569f, 21.0f, 5.0f, 19.0f, 5.0f, 19.0f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 6.1911f, 5.0f, 4.7866f, 5.6741f, 3.7777f)
                curveTo(5.966f, 3.341f, 6.341f, 2.966f, 6.7777f, 2.6741f)
                curveTo(7.7866f, 2.0f, 9.1911f, 2.0f, 12.0f, 2.0f)
                curveTo(14.8089f, 2.0f, 16.2134f, 2.0f, 17.2223f, 2.6741f)
                curveTo(17.659f, 2.966f, 18.034f, 3.341f, 18.3259f, 3.7777f)
                curveTo(19.0f, 4.7866f, 19.0f, 6.1911f, 19.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 4.25f)
                curveTo(8.5858f, 4.25f, 8.25f, 4.5858f, 8.25f, 5.0f)
                curveTo(8.25f, 5.4142f, 8.5858f, 5.75f, 9.0f, 5.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.75f, 15.75f, 5.4142f, 15.75f, 5.0f)
                curveTo(15.75f, 4.5858f, 15.4142f, 4.25f, 15.0f, 4.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
            .build()
        return _smartphoneRotateAngle!!
    }

private var _smartphoneRotateAngle: ImageVector? = null
