package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(
            name = "Scissors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.3462f, 1.6324f)
                curveTo(17.5492f, 1.2714f, 18.0065f, 1.1433f, 18.3676f, 1.3463f)
                curveTo(18.7286f, 1.5493f, 18.8568f, 2.0065f, 18.6538f, 2.3676f)
                lineTo(12.8604f, 12.6717f)
                lineTo(15.5677f, 17.487f)
                curveTo(16.1494f, 16.1695f, 17.4673f, 15.25f, 19.0f, 15.25f)
                curveTo(21.0711f, 15.25f, 22.75f, 16.9289f, 22.75f, 19.0f)
                curveTo(22.75f, 21.0711f, 21.0711f, 22.75f, 19.0f, 22.75f)
                curveTo(17.5771f, 22.75f, 16.3394f, 21.9576f, 15.7039f, 20.7899f)
                lineTo(12.0f, 14.2021f)
                lineTo(8.2961f, 20.7899f)
                curveTo(7.6606f, 21.9576f, 6.4229f, 22.75f, 5.0f, 22.75f)
                curveTo(2.9289f, 22.75f, 1.25f, 21.0711f, 1.25f, 19.0f)
                curveTo(1.25f, 16.9289f, 2.9289f, 15.25f, 5.0f, 15.25f)
                curveTo(6.5327f, 15.25f, 7.8506f, 16.1695f, 8.4323f, 17.487f)
                lineTo(11.1396f, 12.6717f)
                lineTo(5.3462f, 2.3676f)
                curveTo(5.1432f, 2.0065f, 5.2714f, 1.5493f, 5.6324f, 1.3463f)
                curveTo(5.9935f, 1.1433f, 6.4508f, 1.2714f, 6.6538f, 1.6324f)
                lineTo(12.0f, 11.1414f)
                lineTo(17.3462f, 1.6324f)
                close()
                moveTo(5.0f, 21.25f)
                curveTo(5.8354f, 21.25f, 6.5644f, 20.7948f, 6.9526f, 20.1188f)
                lineTo(6.9725f, 20.0833f)
                curveTo(7.1494f, 19.762f, 7.25f, 19.3927f, 7.25f, 19.0f)
                curveTo(7.25f, 17.7574f, 6.2426f, 16.75f, 5.0f, 16.75f)
                curveTo(3.7574f, 16.75f, 2.75f, 17.7574f, 2.75f, 19.0f)
                curveTo(2.75f, 20.2427f, 3.7574f, 21.25f, 5.0f, 21.25f)
                close()
                moveTo(19.0f, 21.25f)
                curveTo(18.1646f, 21.25f, 17.4356f, 20.7948f, 17.0474f, 20.1188f)
                lineTo(17.0275f, 20.0833f)
                curveTo(16.8506f, 19.762f, 16.75f, 19.3927f, 16.75f, 19.0f)
                curveTo(16.75f, 17.7574f, 17.7574f, 16.75f, 19.0f, 16.75f)
                curveTo(20.2426f, 16.75f, 21.25f, 17.7574f, 21.25f, 19.0f)
                curveTo(21.25f, 20.2427f, 20.2426f, 21.25f, 19.0f, 21.25f)
                close()
            }
        }
            .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
