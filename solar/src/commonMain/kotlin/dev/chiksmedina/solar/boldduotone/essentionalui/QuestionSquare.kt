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

val EssentionalUiGroup.QuestionSquare: ImageVector
    get() {
        if (_questionSquare != null) {
            return _questionSquare!!
        }
        _questionSquare = Builder(
            name = "QuestionSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 7.75f)
                curveTo(11.3787f, 7.75f, 10.875f, 8.2537f, 10.875f, 8.875f)
                curveTo(10.875f, 9.2892f, 10.5392f, 9.625f, 10.125f, 9.625f)
                curveTo(9.7108f, 9.625f, 9.375f, 9.2892f, 9.375f, 8.875f)
                curveTo(9.375f, 7.4253f, 10.5503f, 6.25f, 12.0f, 6.25f)
                curveTo(13.4497f, 6.25f, 14.625f, 7.4253f, 14.625f, 8.875f)
                curveTo(14.625f, 9.5858f, 14.3415f, 10.232f, 13.883f, 10.704f)
                curveTo(13.7907f, 10.7989f, 13.7027f, 10.8869f, 13.6187f, 10.9708f)
                curveTo(13.4029f, 11.1864f, 13.2138f, 11.3753f, 13.0479f, 11.5885f)
                curveTo(12.8289f, 11.8699f, 12.75f, 12.0768f, 12.75f, 12.25f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.4142f, 12.4142f, 13.75f, 12.0f, 13.75f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(12.25f)
                curveTo(11.25f, 11.5948f, 11.555f, 11.0644f, 11.8642f, 10.6672f)
                curveTo(12.0929f, 10.3733f, 12.3804f, 10.0863f, 12.6138f, 9.8535f)
                curveTo(12.6842f, 9.7832f, 12.7496f, 9.7179f, 12.807f, 9.6588f)
                curveTo(13.0046f, 9.4554f, 13.125f, 9.18f, 13.125f, 8.875f)
                curveTo(13.125f, 8.2537f, 12.6213f, 7.75f, 12.0f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
            .build()
        return _questionSquare!!
    }

private var _questionSquare: ImageVector? = null
