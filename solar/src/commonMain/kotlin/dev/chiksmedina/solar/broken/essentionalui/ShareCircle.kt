package dev.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.ShareCircle: ImageVector
    get() {
        if (_shareCircle != null) {
            return _shareCircle!!
        }
        _shareCircle = Builder(
            name = "ShareCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.0f)
                curveTo(10.3431f, 3.0f, 9.0f, 4.3432f, 9.0f, 6.0f)
                curveTo(9.0f, 7.6568f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 7.6568f, 15.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 15.0f)
                curveTo(3.8431f, 15.0f, 2.5f, 16.3431f, 2.5f, 18.0f)
                curveTo(2.5f, 19.6569f, 3.8431f, 21.0f, 5.5f, 21.0f)
                curveTo(7.1568f, 21.0f, 8.5f, 19.6569f, 8.5f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 21.0f)
                curveTo(16.8431f, 21.0f, 15.5f, 19.6569f, 15.5f, 18.0f)
                curveTo(15.5f, 16.3431f, 16.8431f, 15.0f, 18.5f, 15.0f)
                curveTo(20.1569f, 15.0f, 21.5f, 16.3431f, 21.5f, 18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 13.0f)
                curveTo(20.0f, 10.6106f, 18.9525f, 8.4659f, 17.2916f, 7.0f)
                moveTo(4.0f, 13.0f)
                curveTo(4.0f, 10.6106f, 5.0475f, 8.4659f, 6.7084f, 7.0f)
                moveTo(10.0f, 20.748f)
                curveTo(10.6392f, 20.9125f, 11.3094f, 21.0f, 12.0f, 21.0f)
                curveTo(12.6906f, 21.0f, 13.3608f, 20.9125f, 14.0f, 20.748f)
            }
        }
            .build()
        return _shareCircle!!
    }

private var _shareCircle: ImageVector? = null
