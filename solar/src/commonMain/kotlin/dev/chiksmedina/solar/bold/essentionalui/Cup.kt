package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Cup: ImageVector
    get() {
        if (_cup != null) {
            return _cup!!
        }
        _cup = Builder(
            name = "Cup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.9999f, 8.1623f)
                lineTo(21.9999f, 8.2349f)
                curveTo(21.9999f, 9.0956f, 21.9999f, 9.526f, 21.7927f, 9.8781f)
                curveTo(21.5855f, 10.2302f, 21.2093f, 10.4392f, 20.4569f, 10.8572f)
                lineTo(19.6636f, 11.298f)
                curveTo(20.2102f, 9.4498f, 20.3926f, 7.4641f, 20.4601f, 5.766f)
                curveTo(20.4629f, 5.6932f, 20.4662f, 5.6195f, 20.4695f, 5.545f)
                lineTo(20.4718f, 5.4928f)
                curveTo(21.1231f, 5.719f, 21.4887f, 5.8876f, 21.7168f, 6.2041f)
                curveTo(22.0f, 6.5969f, 22.0f, 7.1187f, 21.9999f, 8.1623f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.1623f)
                lineTo(2.0f, 8.2349f)
                curveTo(2.0f, 9.0956f, 2.0f, 9.526f, 2.2072f, 9.8781f)
                curveTo(2.4144f, 10.2302f, 2.7906f, 10.4392f, 3.5431f, 10.8572f)
                lineTo(4.3368f, 11.2982f)
                curveTo(3.7901f, 9.45f, 3.6077f, 7.4642f, 3.5403f, 5.766f)
                curveTo(3.5374f, 5.6932f, 3.5341f, 5.6195f, 3.5308f, 5.545f)
                lineTo(3.5285f, 5.4927f)
                curveTo(2.877f, 5.7189f, 2.5113f, 5.8875f, 2.2831f, 6.2041f)
                curveTo(2.0f, 6.5969f, 2.0f, 7.1187f, 2.0f, 8.1623f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.3771f, 2.3467f)
                curveTo(15.2531f, 2.1571f, 13.7837f, 2.0f, 12.0002f, 2.0f)
                curveTo(10.2166f, 2.0f, 8.7472f, 2.1571f, 7.6232f, 2.3467f)
                curveTo(6.4844f, 2.5389f, 5.9151f, 2.6349f, 5.4394f, 3.2208f)
                curveTo(4.9637f, 3.8067f, 4.9888f, 4.44f, 5.0391f, 5.7065f)
                curveTo(5.2117f, 10.0544f, 6.15f, 15.4851f, 11.25f, 15.9657f)
                verticalLineTo(19.5f)
                horizontalLineTo(9.8198f)
                curveTo(9.3431f, 19.5f, 8.9327f, 19.8365f, 8.8392f, 20.3039f)
                lineTo(8.65f, 21.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 21.25f, 5.25f, 21.5858f, 5.25f, 22.0f)
                curveTo(5.25f, 22.4142f, 5.5858f, 22.75f, 6.0f, 22.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 22.75f, 18.75f, 22.4142f, 18.75f, 22.0f)
                curveTo(18.75f, 21.5858f, 18.4142f, 21.25f, 18.0f, 21.25f)
                horizontalLineTo(15.35f)
                lineTo(15.1608f, 20.3039f)
                curveTo(15.0673f, 19.8365f, 14.6569f, 19.5f, 14.1802f, 19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.9657f)
                curveTo(17.8503f, 15.4853f, 18.7886f, 10.0545f, 18.9612f, 5.7065f)
                curveTo(19.0115f, 4.44f, 19.0367f, 3.8067f, 18.5609f, 3.2208f)
                curveTo(18.0852f, 2.6349f, 17.5159f, 2.5389f, 16.3771f, 2.3467f)
                close()
            }
        }
            .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
