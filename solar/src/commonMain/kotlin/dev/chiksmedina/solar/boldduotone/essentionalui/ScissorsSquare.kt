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

val EssentionalUiGroup.ScissorsSquare: ImageVector
    get() {
        if (_scissorsSquare != null) {
            return _scissorsSquare!!
        }
        _scissorsSquare = Builder(
            name = "ScissorsSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.379f, 5.3529f)
                curveTo(16.0216f, 5.1436f, 15.5622f, 5.2637f, 15.3528f, 5.6211f)
                lineTo(12.0001f, 11.3457f)
                lineTo(8.6474f, 5.6211f)
                curveTo(8.4381f, 5.2637f, 7.9786f, 5.1436f, 7.6212f, 5.3529f)
                curveTo(7.2638f, 5.5623f, 7.1437f, 6.0217f, 7.3531f, 6.3791f)
                lineTo(11.131f, 12.8298f)
                lineTo(10.0195f, 14.7277f)
                curveTo(9.5391f, 14.0703f, 8.7478f, 13.6501f, 7.875f, 13.6501f)
                curveTo(6.4544f, 13.6501f, 5.25f, 14.7632f, 5.25f, 16.2001f)
                curveTo(5.25f, 17.637f, 6.4544f, 18.7501f, 7.875f, 18.7501f)
                curveTo(8.8673f, 18.7501f, 9.7542f, 18.207f, 10.1987f, 17.3898f)
                lineTo(12.0001f, 14.3139f)
                lineTo(13.8015f, 17.3898f)
                curveTo(14.2461f, 18.207f, 15.1329f, 18.7501f, 16.1252f, 18.7501f)
                curveTo(17.5458f, 18.7501f, 18.7502f, 17.637f, 18.7502f, 16.2001f)
                curveTo(18.7502f, 14.7632f, 17.5458f, 13.6501f, 16.1252f, 13.6501f)
                curveTo(15.2524f, 13.6501f, 14.4612f, 14.0703f, 13.9808f, 14.7277f)
                lineTo(12.8693f, 12.8298f)
                lineTo(16.6472f, 6.3791f)
                curveTo(16.8565f, 6.0217f, 16.7365f, 5.5623f, 16.379f, 5.3529f)
                close()
            }
        }
            .build()
        return _scissorsSquare!!
    }

private var _scissorsSquare: ImageVector? = null
