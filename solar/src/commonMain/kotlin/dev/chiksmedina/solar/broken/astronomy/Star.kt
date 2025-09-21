package dev.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.AstronomyGroup

val AstronomyGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                verticalLineTo(17.6f)
                moveTo(12.0f, 6.4f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 12.0f)
                horizontalLineTo(17.6f)
                moveTo(6.4f, 12.0f)
                horizontalLineTo(4.0f)
                moveTo(17.6569f, 6.3432f)
                lineTo(15.9598f, 8.0402f)
                moveTo(8.0402f, 15.9598f)
                lineTo(6.3432f, 17.6569f)
                moveTo(6.3429f, 6.3433f)
                lineTo(8.04f, 8.0404f)
                moveTo(15.9596f, 15.96f)
                lineTo(17.6566f, 17.657f)
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
