package dev.chiksmedina.solar.boldduotone.sports

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
import dev.chiksmedina.solar.boldduotone.SportsGroup

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
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 4.5f)
                curveTo(17.0f, 5.8807f, 15.8807f, 7.0f, 14.5f, 7.0f)
                curveTo(13.1193f, 7.0f, 12.0f, 5.8807f, 12.0f, 4.5f)
                curveTo(12.0f, 3.1193f, 13.1193f, 2.0f, 14.5f, 2.0f)
                curveTo(15.8807f, 2.0f, 17.0f, 3.1193f, 17.0f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.5072f, 14.4639f)
                curveTo(17.7239f, 14.1069f, 19.75f, 15.8031f, 19.75f, 18.0486f)
                verticalLineTo(21.9957f)
                curveTo(19.75f, 22.4099f, 19.4142f, 22.7457f, 19.0f, 22.7457f)
                curveTo(18.5858f, 22.7457f, 18.25f, 22.4099f, 18.25f, 21.9957f)
                verticalLineTo(18.0486f)
                curveTo(18.25f, 16.7424f, 17.0661f, 15.7322f, 15.7458f, 15.9449f)
                curveTo(15.3368f, 16.0107f, 14.9519f, 15.7326f, 14.886f, 15.3237f)
                curveTo(14.8202f, 14.9147f, 15.0983f, 14.5298f, 15.5072f, 14.4639f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.3633f, 10.3462f)
                curveTo(13.8381f, 11.094f, 14.0951f, 12.1107f, 14.0951f, 13.4346f)
                curveTo(14.0951f, 18.5174f, 10.1339f, 22.7503f, 5.0f, 22.7503f)
                curveTo(4.5858f, 22.7503f, 4.25f, 22.4145f, 4.25f, 22.0003f)
                curveTo(4.25f, 21.5861f, 4.5858f, 21.2503f, 5.0f, 21.2503f)
                curveTo(9.2549f, 21.2503f, 12.5951f, 17.7405f, 12.5951f, 13.4346f)
                curveTo(12.5951f, 12.2912f, 12.3715f, 11.5826f, 12.097f, 11.1501f)
                curveTo(11.8323f, 10.7333f, 11.4884f, 10.5212f, 11.116f, 10.422f)
                curveTo(10.726f, 10.318f, 10.2869f, 10.3352f, 9.8789f, 10.4247f)
                curveTo(9.4628f, 10.5159f, 9.1521f, 10.6658f, 9.0268f, 10.7546f)
                curveTo(8.707f, 10.9813f, 8.3808f, 11.4087f, 8.2455f, 11.8569f)
                curveTo(8.1175f, 12.2809f, 8.1806f, 12.6166f, 8.4445f, 12.8716f)
                lineTo(8.4692f, 12.8955f)
                curveTo(8.7671f, 13.1833f, 8.7752f, 13.6582f, 8.4874f, 13.956f)
                curveTo(8.1995f, 14.2539f, 7.7247f, 14.262f, 7.4269f, 13.9741f)
                lineTo(7.4021f, 13.9502f)
                curveTo(6.6241f, 13.1983f, 6.5687f, 12.2212f, 6.8095f, 11.4235f)
                curveTo(7.043f, 10.6499f, 7.5726f, 9.9466f, 8.1596f, 9.5307f)
                curveTo(8.4877f, 9.2983f, 8.9977f, 9.0823f, 9.5576f, 8.9595f)
                curveTo(10.1256f, 8.835f, 10.8178f, 8.7901f, 11.5024f, 8.9726f)
                curveTo(12.2047f, 9.1598f, 12.8787f, 9.5828f, 13.3633f, 10.3462f)
                close()
            }
        }
            .build()
        return _stretchingRound!!
    }

private var _stretchingRound: ImageVector? = null
