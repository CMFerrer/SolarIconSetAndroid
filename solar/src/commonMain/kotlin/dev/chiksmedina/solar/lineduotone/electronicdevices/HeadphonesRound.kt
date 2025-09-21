package dev.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.HeadphonesRound: ImageVector
    get() {
        if (_headphonesRound != null) {
            return _headphonesRound!!
        }
        _headphonesRound = Builder(
            name = "HeadphonesRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                verticalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 15.5f)
                verticalLineTo(17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.5f)
                verticalLineTo(17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.8446f)
                curveTo(8.0f, 13.0802f, 8.0f, 12.698f, 7.8253f, 12.4323f)
                curveTo(7.7373f, 12.2985f, 7.6206f, 12.188f, 7.4844f, 12.1095f)
                curveTo(7.2137f, 11.9535f, 6.8481f, 11.9896f, 6.1169f, 12.0617f)
                curveTo(4.8849f, 12.1831f, 4.2688f, 12.2439f, 3.8274f, 12.5764f)
                curveTo(3.6039f, 12.7448f, 3.4164f, 12.9593f, 3.2765f, 13.2067f)
                curveTo(3.0f, 13.6955f, 3.0f, 14.3395f, 3.0f, 15.6276f)
                verticalLineTo(17.1933f)
                curveTo(3.0f, 18.4685f, 3.0f, 19.1061f, 3.282f, 19.5986f)
                curveTo(3.3875f, 19.7829f, 3.5198f, 19.9491f, 3.6742f, 20.0913f)
                curveTo(4.0865f, 20.4714f, 4.6884f, 20.5901f, 5.8923f, 20.8275f)
                curveTo(6.7394f, 20.9945f, 7.163f, 21.078f, 7.4756f, 20.9021f)
                curveTo(7.591f, 20.8372f, 7.693f, 20.7493f, 7.7757f, 20.6434f)
                curveTo(8.0f, 20.3565f, 8.0f, 19.9078f, 8.0f, 19.0104f)
                verticalLineTo(13.8446f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 13.8446f)
                curveTo(16.0f, 13.0802f, 16.0f, 12.698f, 16.1747f, 12.4323f)
                curveTo(16.2627f, 12.2985f, 16.3794f, 12.188f, 16.5156f, 12.1095f)
                curveTo(16.7863f, 11.9535f, 17.1519f, 11.9896f, 17.8831f, 12.0617f)
                curveTo(19.1151f, 12.1831f, 19.7312f, 12.2439f, 20.1726f, 12.5764f)
                curveTo(20.3961f, 12.7448f, 20.5836f, 12.9593f, 20.7235f, 13.2067f)
                curveTo(21.0f, 13.6955f, 21.0f, 14.3395f, 21.0f, 15.6276f)
                verticalLineTo(17.1933f)
                curveTo(21.0f, 18.4685f, 21.0f, 19.1061f, 20.718f, 19.5986f)
                curveTo(20.6125f, 19.7829f, 20.4802f, 19.9491f, 20.3258f, 20.0913f)
                curveTo(19.9135f, 20.4714f, 19.3116f, 20.5901f, 18.1077f, 20.8275f)
                curveTo(17.2606f, 20.9945f, 16.837f, 21.078f, 16.5244f, 20.9021f)
                curveTo(16.409f, 20.8372f, 16.307f, 20.7493f, 16.2243f, 20.6434f)
                curveTo(16.0f, 20.3565f, 16.0f, 19.9078f, 16.0f, 19.0104f)
                verticalLineTo(13.8446f)
                close()
            }
        }
            .build()
        return _headphonesRound!!
    }

private var _headphonesRound: ImageVector? = null
