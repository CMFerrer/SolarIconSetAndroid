package dev.chiksmedina.solar.broken.essentionalui

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
import dev.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.DangerTriangle: ImageVector
    get() {
        if (_dangerTriangle != null) {
            return _dangerTriangle!!
        }
        _dangerTriangle = Builder(
            name = "DangerTriangle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.3093f, 9.0f)
                curveTo(8.5949f, 5.0f, 9.9683f, 3.0f, 12.0f, 3.0f)
                curveTo(14.3107f, 3.0f, 15.7699f, 5.5872f, 18.6883f, 10.7615f)
                lineTo(19.0519f, 11.4063f)
                curveTo(21.4771f, 15.7061f, 22.6897f, 17.856f, 21.5937f, 19.428f)
                curveTo(20.4978f, 21.0f, 17.7864f, 21.0f, 12.3637f, 21.0f)
                horizontalLineTo(11.6363f)
                curveTo(6.2136f, 21.0f, 3.5022f, 21.0f, 2.4063f, 19.428f)
                curveTo(1.455f, 18.0635f, 2.2431f, 16.2635f, 4.0537f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 16.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _dangerTriangle!!
    }

private var _dangerTriangle: ImageVector? = null
