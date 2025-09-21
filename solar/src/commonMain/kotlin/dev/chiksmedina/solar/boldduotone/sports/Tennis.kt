package dev.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(
            name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.1959f, 2.0709f)
                curveTo(11.1208f, 1.8194f, 8.9497f, 2.2139f, 7.0001f, 3.3395f)
                curveTo(5.1462f, 4.4098f, 3.7647f, 5.9841f, 2.9287f, 7.7894f)
                curveTo(3.9451f, 8.5112f, 6.5632f, 10.5831f, 8.536f, 14.0001f)
                curveTo(8.6923f, 14.2708f, 8.8378f, 14.5385f, 8.9735f, 14.8028f)
                curveTo(9.0998f, 15.0489f, 9.2175f, 15.2919f, 9.3272f, 15.5313f)
                curveTo(9.4307f, 15.7573f, 9.527f, 15.98f, 9.6167f, 16.199f)
                curveTo(9.7047f, 16.4138f, 9.7862f, 16.625f, 9.8618f, 16.8322f)
                curveTo(10.9301f, 19.761f, 10.8071f, 21.8831f, 10.8043f, 21.929f)
                curveTo(12.2386f, 22.1028f, 13.7187f, 21.9677f, 15.1398f, 21.4962f)
                curveTo(15.2278f, 21.467f, 15.3156f, 21.4365f, 15.4031f, 21.4047f)
                curveTo(15.6118f, 21.3289f, 15.819f, 21.2458f, 16.0245f, 21.1551f)
                curveTo(16.1073f, 21.1186f, 16.1898f, 21.0809f, 16.272f, 21.0419f)
                curveTo(16.5177f, 20.9255f, 16.7605f, 20.7983f, 17.0001f, 20.66f)
                curveTo(18.9497f, 19.5344f, 20.3769f, 17.8514f, 21.1966f, 15.9286f)
                curveTo(21.1966f, 15.9286f, 17.9642f, 14.3303f, 15.4642f, 10.0001f)
                curveTo(12.9642f, 5.67f, 13.1959f, 2.0709f, 13.1959f, 2.0709f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.8303f, 17.7677f)
                lineTo(3.8734f, 17.8284f)
                curveTo(4.0828f, 18.1212f, 4.3058f, 18.3997f, 4.5411f, 18.6636f)
                curveTo(4.8241f, 18.9811f, 5.1249f, 19.2775f, 5.4409f, 19.552f)
                curveTo(5.5256f, 19.6256f, 5.6114f, 19.6976f, 5.6982f, 19.768f)
                curveTo(7.1726f, 20.9637f, 8.9502f, 21.7046f, 10.8044f, 21.9294f)
                curveTo(10.8078f, 21.8738f, 10.9276f, 19.7544f, 9.8619f, 16.8326f)
                curveTo(9.7863f, 16.6254f, 9.7048f, 16.4142f, 9.6168f, 16.1994f)
                curveTo(9.5272f, 15.9804f, 9.4308f, 15.7577f, 9.3273f, 15.5317f)
                curveTo(9.2177f, 15.2923f, 9.0999f, 15.0493f, 8.9736f, 14.8032f)
                curveTo(8.838f, 14.5389f, 8.6924f, 14.2712f, 8.5361f, 14.0005f)
                curveTo(6.5633f, 10.5835f, 3.9452f, 8.5116f, 2.9288f, 7.7898f)
                curveTo(1.608f, 10.6421f, 1.6489f, 14.0711f, 3.34f, 17.0001f)
                curveTo(3.4933f, 17.2658f, 3.657f, 17.5217f, 3.8303f, 17.7677f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.6605f, 7.0001f)
                curveTo(19.0246f, 4.1668f, 16.2117f, 2.4368f, 13.196f, 2.0713f)
                curveTo(13.196f, 2.0713f, 12.9643f, 5.6704f, 15.4643f, 10.0005f)
                curveTo(17.9643f, 14.3307f, 21.1967f, 15.929f, 21.1967f, 15.929f)
                curveTo(22.388f, 13.1345f, 22.2963f, 9.8335f, 20.6605f, 7.0001f)
                close()
            }
        }
            .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
