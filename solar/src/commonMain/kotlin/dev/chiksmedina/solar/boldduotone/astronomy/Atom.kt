package dev.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(
            name = "Atom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4712f, 16.4711f)
                curveTo(21.4099f, 11.5324f, 23.4117f, 5.527f, 20.9423f, 3.0577f)
                curveTo(18.473f, 0.5883f, 12.4676f, 2.5901f, 7.529f, 7.5288f)
                curveTo(2.5903f, 12.4675f, 0.5885f, 18.4728f, 3.0579f, 20.9422f)
                curveTo(5.5272f, 23.4115f, 11.5326f, 21.4097f, 16.4712f, 16.4711f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5288f, 16.4712f)
                curveTo(2.5901f, 11.5325f, 0.5883f, 5.5272f, 3.0577f, 3.0578f)
                curveTo(5.527f, 0.5885f, 11.5324f, 2.5903f, 16.471f, 7.5289f)
                curveTo(21.4097f, 12.4676f, 23.4115f, 18.473f, 20.9421f, 20.9423f)
                curveTo(18.4728f, 23.4117f, 12.4674f, 21.4099f, 7.5288f, 16.4712f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5f, 12.0f)
                curveTo(14.5f, 13.3807f, 13.3807f, 14.5f, 12.0f, 14.5f)
                curveTo(10.6193f, 14.5f, 9.5f, 13.3807f, 9.5f, 12.0f)
                curveTo(9.5f, 10.6193f, 10.6193f, 9.5f, 12.0f, 9.5f)
                curveTo(13.3807f, 9.5f, 14.5f, 10.6193f, 14.5f, 12.0f)
                close()
            }
        }
            .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
