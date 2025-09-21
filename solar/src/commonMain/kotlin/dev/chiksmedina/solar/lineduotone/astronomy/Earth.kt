package dev.chiksmedina.solar.lineduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.AstronomyGroup

val AstronomyGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(
            name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 4.7105f)
                curveTo(6.7802f, 5.4211f, 8.3876f, 7.3632f, 8.5748f, 9.4474f)
                curveTo(8.7498f, 11.3955f, 10.0357f, 12.9786f, 12.0f, 13.0f)
                curveTo(12.7549f, 13.0082f, 13.5183f, 12.4629f, 13.5164f, 11.708f)
                curveTo(13.5158f, 11.4745f, 13.4773f, 11.2358f, 13.417f, 11.0163f)
                curveTo(13.3331f, 10.7108f, 13.3257f, 10.3595f, 13.5f, 10.0f)
                curveTo(14.1099f, 8.7425f, 15.3094f, 8.4048f, 16.2599f, 7.7219f)
                curveTo(16.6814f, 7.419f, 17.0659f, 7.0995f, 17.2355f, 6.8421f)
                curveTo(17.7037f, 6.1316f, 18.1718f, 4.7105f, 17.9377f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.0f)
                curveTo(21.6706f, 13.931f, 21.4375f, 16.375f, 17.7182f, 16.4138f)
                curveTo(17.7182f, 16.4138f, 14.4246f, 16.4138f, 13.4365f, 18.2759f)
                curveTo(12.646f, 19.7655f, 13.1071f, 21.3793f, 13.4365f, 22.0f)
            }
        }
            .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
