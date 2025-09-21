package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(
            name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(3.0365f)
                lineTo(17.8117f, 5.5673f)
                curveTo(18.5461f, 5.9345f, 19.1721f, 6.2474f, 19.6077f, 6.5515f)
                curveTo(20.0495f, 6.8598f, 20.5139f, 7.3075f, 20.5139f, 8.0f)
                curveTo(20.5139f, 8.6925f, 20.0495f, 9.1402f, 19.6077f, 9.4485f)
                curveTo(19.1721f, 9.7526f, 18.5461f, 10.0655f, 17.8116f, 10.4327f)
                lineTo(12.75f, 12.9635f)
                verticalLineTo(14.2595f)
                curveTo(15.2793f, 14.3234f, 17.5807f, 14.7089f, 19.3188f, 15.3172f)
                curveTo(20.2696f, 15.65f, 21.0925f, 16.0635f, 21.6923f, 16.5598f)
                curveTo(22.2874f, 17.0522f, 22.75f, 17.7041f, 22.75f, 18.5f)
                curveTo(22.75f, 19.2959f, 22.2874f, 19.9478f, 21.6923f, 20.4402f)
                curveTo(21.0925f, 20.9365f, 20.2696f, 21.35f, 19.3188f, 21.6828f)
                curveTo(17.4104f, 22.3507f, 14.8228f, 22.75f, 12.0f, 22.75f)
                curveTo(9.1772f, 22.75f, 6.5896f, 22.3507f, 4.6812f, 21.6828f)
                curveTo(3.7304f, 21.35f, 2.9075f, 20.9365f, 2.3077f, 20.4402f)
                curveTo(1.7126f, 19.9478f, 1.25f, 19.2959f, 1.25f, 18.5f)
                curveTo(1.25f, 17.7041f, 1.7126f, 17.0522f, 2.3077f, 16.5598f)
                curveTo(2.9075f, 16.0635f, 3.7304f, 15.65f, 4.6812f, 15.3172f)
                curveTo(6.4193f, 14.7089f, 8.7207f, 14.3234f, 11.25f, 14.2595f)
                verticalLineTo(12.5216f)
                curveTo(11.2496f, 12.5076f, 11.2496f, 12.4935f, 11.25f, 12.4796f)
                verticalLineTo(3.5205f)
                curveTo(11.2496f, 3.5065f, 11.2496f, 3.4924f, 11.25f, 3.4784f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(12.75f, 4.7136f)
                verticalLineTo(11.2864f)
                lineTo(17.0868f, 9.118f)
                curveTo(17.8902f, 8.7163f, 18.415f, 8.4518f, 18.7492f, 8.2185f)
                curveTo(18.9074f, 8.1081f, 18.9756f, 8.0369f, 19.0033f, 8.0f)
                curveTo(18.9756f, 7.9631f, 18.9074f, 7.8919f, 18.7492f, 7.7815f)
                curveTo(18.415f, 7.5482f, 17.8902f, 7.2836f, 17.0868f, 6.882f)
                lineTo(12.75f, 4.7136f)
                close()
                moveTo(19.0205f, 8.0307f)
                curveTo(19.0197f, 8.0306f, 19.0173f, 8.0264f, 19.0156f, 8.0184f)
                curveTo(19.0205f, 8.0268f, 19.0213f, 8.0308f, 19.0205f, 8.0307f)
                close()
                moveTo(19.0156f, 7.9816f)
                curveTo(19.0173f, 7.9736f, 19.0197f, 7.9694f, 19.0205f, 7.9693f)
                curveTo(19.0213f, 7.9692f, 19.0205f, 7.9732f, 19.0156f, 7.9816f)
                close()
                moveTo(11.25f, 15.76f)
                curveTo(8.8546f, 15.8238f, 6.7275f, 16.1903f, 5.1767f, 16.733f)
                curveTo(4.3178f, 17.0336f, 3.6762f, 17.3744f, 3.264f, 17.7155f)
                curveTo(2.847f, 18.0605f, 2.75f, 18.3294f, 2.75f, 18.5f)
                curveTo(2.75f, 18.6706f, 2.847f, 18.9395f, 3.264f, 19.2845f)
                curveTo(3.6762f, 19.6256f, 4.3178f, 19.9664f, 5.1767f, 20.267f)
                curveTo(6.8875f, 20.8658f, 9.2999f, 21.25f, 12.0f, 21.25f)
                curveTo(14.7001f, 21.25f, 17.1125f, 20.8658f, 18.8233f, 20.267f)
                curveTo(19.6822f, 19.9664f, 20.3238f, 19.6256f, 20.736f, 19.2845f)
                curveTo(21.153f, 18.9395f, 21.25f, 18.6706f, 21.25f, 18.5f)
                curveTo(21.25f, 18.3294f, 21.153f, 18.0605f, 20.736f, 17.7155f)
                curveTo(20.3238f, 17.3744f, 19.6822f, 17.0336f, 18.8233f, 16.733f)
                curveTo(17.2725f, 16.1903f, 15.1454f, 15.8238f, 12.75f, 15.76f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(15.76f)
                close()
            }
        }
            .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
