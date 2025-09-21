package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

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
                pathFillType = NonZero
            ) {
                moveTo(6.6538f, 1.6326f)
                curveTo(6.4508f, 1.2715f, 5.9935f, 1.1434f, 5.6324f, 1.3464f)
                curveTo(5.2714f, 1.5494f, 5.1432f, 2.0066f, 5.3462f, 2.3677f)
                lineTo(11.1396f, 12.6718f)
                lineTo(8.4323f, 17.4871f)
                curveTo(7.8506f, 16.1697f, 6.5327f, 15.2501f, 5.0f, 15.2501f)
                curveTo(2.9289f, 15.2501f, 1.25f, 16.9291f, 1.25f, 19.0001f)
                curveTo(1.25f, 21.0712f, 2.9289f, 22.7501f, 5.0f, 22.7501f)
                curveTo(6.4229f, 22.7501f, 7.6606f, 21.9577f, 8.2961f, 20.7901f)
                lineTo(12.0f, 14.2022f)
                lineTo(15.7039f, 20.79f)
                curveTo(16.3393f, 21.9577f, 17.5771f, 22.7501f, 19.0f, 22.7501f)
                curveTo(21.0711f, 22.7501f, 22.75f, 21.0712f, 22.75f, 19.0001f)
                curveTo(22.75f, 16.9291f, 21.0711f, 15.2501f, 19.0f, 15.2501f)
                curveTo(17.4673f, 15.2501f, 16.1494f, 16.1696f, 15.5677f, 17.4871f)
                lineTo(12.8604f, 12.6718f)
                lineTo(18.6538f, 2.3677f)
                curveTo(18.8568f, 2.0066f, 18.7286f, 1.5494f, 18.3676f, 1.3464f)
                curveTo(18.0065f, 1.1434f, 17.5492f, 1.2715f, 17.3462f, 1.6326f)
                lineTo(12.0f, 11.1415f)
                lineTo(6.6538f, 1.6326f)
                close()
            }
        }
            .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
