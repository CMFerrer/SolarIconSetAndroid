package com.chiksmedina.solar.broken.essentionalui

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
import com.chiksmedina.solar.broken.EssentionalUiGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4013f, 20.5f)
                lineTo(6.0f, 2.0f)
                moveTo(22.0f, 19.0f)
                curveTo(22.0f, 20.6569f, 20.6569f, 22.0f, 19.0f, 22.0f)
                curveTo(17.3431f, 22.0f, 16.0f, 20.6569f, 16.0f, 19.0f)
                curveTo(16.0f, 17.3431f, 17.3431f, 16.0f, 19.0f, 16.0f)
                curveTo(20.6569f, 16.0f, 22.0f, 17.3431f, 22.0f, 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 21.25f)
                curveTo(5.4142f, 21.25f, 5.75f, 21.5858f, 5.75f, 22.0f)
                curveTo(5.75f, 22.4142f, 5.4142f, 22.75f, 5.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(8.75f, 19.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(7.25f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.2524f, 20.8676f)
                curveTo(8.0494f, 21.2286f, 7.5922f, 21.3568f, 7.2311f, 21.1538f)
                curveTo(6.87f, 20.9508f, 6.7419f, 20.4935f, 6.9449f, 20.1324f)
                lineTo(8.2524f, 20.8676f)
                close()
                moveTo(17.3462f, 1.6324f)
                curveTo(17.5492f, 1.2714f, 18.0065f, 1.1432f, 18.3676f, 1.3462f)
                curveTo(18.7286f, 1.5492f, 18.8568f, 2.0065f, 18.6538f, 2.3676f)
                lineTo(17.3462f, 1.6324f)
                close()
                moveTo(2.75f, 19.0f)
                curveTo(2.75f, 20.2426f, 3.7574f, 21.25f, 5.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(2.9289f, 22.75f, 1.25f, 21.0711f, 1.25f, 19.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(7.25f, 19.0f)
                curveTo(7.25f, 17.7574f, 6.2426f, 16.75f, 5.0f, 16.75f)
                verticalLineTo(15.25f)
                curveTo(7.0711f, 15.25f, 8.75f, 16.9289f, 8.75f, 19.0f)
                horizontalLineTo(7.25f)
                close()
                moveTo(5.0f, 16.75f)
                curveTo(3.7574f, 16.75f, 2.75f, 17.7574f, 2.75f, 19.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 16.9289f, 2.9289f, 15.25f, 5.0f, 15.25f)
                verticalLineTo(16.75f)
                close()
                moveTo(6.9449f, 20.1324f)
                lineTo(17.3462f, 1.6324f)
                lineTo(18.6538f, 2.3676f)
                lineTo(8.2524f, 20.8676f)
                lineTo(6.9449f, 20.1324f)
                close()
            }
        }
            .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
