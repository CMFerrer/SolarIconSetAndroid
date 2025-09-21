package dev.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.SlashSquare: ImageVector
    get() {
        if (_slashSquare != null) {
            return _slashSquare!!
        }
        _slashSquare = Builder(
            name = "SlashSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(14.0184f, 7.3645f)
                curveTo(14.1257f, 6.9644f, 13.8882f, 6.5532f, 13.4881f, 6.446f)
                curveTo(13.088f, 6.3387f, 12.6768f, 6.5762f, 12.5696f, 6.9763f)
                lineTo(9.9814f, 16.6355f)
                curveTo(9.8742f, 17.0356f, 10.1116f, 17.4469f, 10.5117f, 17.5541f)
                curveTo(10.9118f, 17.6613f, 11.323f, 17.4239f, 11.4303f, 17.0238f)
                lineTo(14.0184f, 7.3645f)
                close()
            }
        }
            .build()
        return _slashSquare!!
    }

private var _slashSquare: ImageVector? = null
