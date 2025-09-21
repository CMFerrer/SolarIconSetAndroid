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

val SportsGroup.StretchingRound: ImageVector
    get() {
        if (_stretchingRound != null) {
            return _stretchingRound!!
        }
        _stretchingRound = Builder(
            name = "StretchingRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5f, 2.75f)
                curveTo(13.5335f, 2.75f, 12.75f, 3.5335f, 12.75f, 4.5f)
                curveTo(12.75f, 5.4665f, 13.5335f, 6.25f, 14.5f, 6.25f)
                curveTo(15.4665f, 6.25f, 16.25f, 5.4665f, 16.25f, 4.5f)
                curveTo(16.25f, 3.5335f, 15.4665f, 2.75f, 14.5f, 2.75f)
                close()
                moveTo(11.25f, 4.5f)
                curveTo(11.25f, 2.7051f, 12.7051f, 1.25f, 14.5f, 1.25f)
                curveTo(16.2949f, 1.25f, 17.75f, 2.7051f, 17.75f, 4.5f)
                curveTo(17.75f, 6.2949f, 16.2949f, 7.75f, 14.5f, 7.75f)
                curveTo(12.7051f, 7.75f, 11.25f, 6.2949f, 11.25f, 4.5f)
                close()
                moveTo(13.3633f, 10.3459f)
                curveTo(13.8381f, 11.0937f, 14.0951f, 12.1104f, 14.0951f, 13.4343f)
                curveTo(14.0951f, 18.5171f, 10.1339f, 22.75f, 5.0f, 22.75f)
                curveTo(4.5858f, 22.75f, 4.25f, 22.4142f, 4.25f, 22.0f)
                curveTo(4.25f, 21.5858f, 4.5858f, 21.25f, 5.0f, 21.25f)
                curveTo(9.2549f, 21.25f, 12.5951f, 17.7402f, 12.5951f, 13.4343f)
                curveTo(12.5951f, 12.2909f, 12.3715f, 11.5823f, 12.097f, 11.1498f)
                curveTo(11.8323f, 10.733f, 11.4884f, 10.5209f, 11.116f, 10.4217f)
                curveTo(10.726f, 10.3177f, 10.2869f, 10.3349f, 9.8789f, 10.4244f)
                curveTo(9.4628f, 10.5156f, 9.1521f, 10.6655f, 9.0268f, 10.7544f)
                curveTo(8.707f, 10.981f, 8.3808f, 11.4084f, 8.2455f, 11.8566f)
                curveTo(8.1175f, 12.2806f, 8.1806f, 12.6163f, 8.4445f, 12.8713f)
                lineTo(8.4445f, 12.8713f)
                lineTo(8.4693f, 12.8952f)
                curveTo(8.7671f, 13.1831f, 8.7752f, 13.6579f, 8.4874f, 13.9557f)
                curveTo(8.1995f, 14.2536f, 7.7247f, 14.2617f, 7.4269f, 13.9738f)
                lineTo(7.4021f, 13.9499f)
                curveTo(7.4021f, 13.9499f, 7.4021f, 13.9499f, 7.4021f, 13.9499f)
                curveTo(6.6241f, 13.198f, 6.5687f, 12.2209f, 6.8095f, 11.4232f)
                curveTo(7.043f, 10.6496f, 7.5726f, 9.9463f, 8.1596f, 9.5304f)
                curveTo(8.4877f, 9.298f, 8.9977f, 9.082f, 9.5576f, 8.9592f)
                curveTo(10.1256f, 8.8347f, 10.8178f, 8.7898f, 11.5024f, 8.9723f)
                curveTo(12.2047f, 9.1595f, 12.8787f, 9.5825f, 13.3633f, 10.3459f)
                close()
                moveTo(15.5072f, 14.4639f)
                curveTo(17.7239f, 14.1069f, 19.75f, 15.8031f, 19.75f, 18.0486f)
                verticalLineTo(21.9957f)
                curveTo(19.75f, 22.4099f, 19.4142f, 22.7457f, 19.0f, 22.7457f)
                curveTo(18.5858f, 22.7457f, 18.25f, 22.4099f, 18.25f, 21.9957f)
                verticalLineTo(18.0486f)
                curveTo(18.25f, 16.7423f, 17.0661f, 15.7322f, 15.7458f, 15.9449f)
                curveTo(15.3368f, 16.0107f, 14.9519f, 15.7326f, 14.886f, 15.3237f)
                curveTo(14.8202f, 14.9147f, 15.0983f, 14.5298f, 15.5072f, 14.4639f)
                close()
            }
        }
            .build()
        return _stretchingRound!!
    }

private var _stretchingRound: ImageVector? = null
