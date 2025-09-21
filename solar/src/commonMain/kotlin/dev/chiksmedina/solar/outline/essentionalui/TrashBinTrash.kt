package dev.chiksmedina.solar.outline.essentionalui

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
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.TrashBinTrash: ImageVector
    get() {
        if (_trashBinTrash != null) {
            return _trashBinTrash!!
        }
        _trashBinTrash = Builder(
            name = "TrashBinTrash", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.3093f, 2.25f)
                horizontalLineTo(13.6907f)
                curveTo(13.9071f, 2.2498f, 14.0956f, 2.2497f, 14.2736f, 2.2781f)
                curveTo(14.9769f, 2.3904f, 15.5855f, 2.8291f, 15.9145f, 3.4608f)
                curveTo(15.9978f, 3.6207f, 16.0573f, 3.7996f, 16.1256f, 4.0049f)
                lineTo(16.2372f, 4.3398f)
                curveTo(16.2561f, 4.3965f, 16.2615f, 4.4125f, 16.266f, 4.4252f)
                curveTo(16.4412f, 4.9093f, 16.8952f, 5.2365f, 17.4098f, 5.2496f)
                curveTo(17.4234f, 5.2499f, 17.4399f, 5.25f, 17.5f, 5.25f)
                horizontalLineTo(20.5f)
                curveTo(20.9142f, 5.25f, 21.25f, 5.5858f, 21.25f, 6.0f)
                curveTo(21.25f, 6.4142f, 20.9142f, 6.75f, 20.5f, 6.75f)
                horizontalLineTo(3.4999f)
                curveTo(3.0857f, 6.75f, 2.7499f, 6.4142f, 2.7499f, 6.0f)
                curveTo(2.7499f, 5.5858f, 3.0857f, 5.25f, 3.4999f, 5.25f)
                horizontalLineTo(6.5f)
                curveTo(6.56f, 5.25f, 6.5766f, 5.2499f, 6.5901f, 5.2496f)
                curveTo(7.1048f, 5.2365f, 7.5588f, 4.9093f, 7.7339f, 4.4252f)
                curveTo(7.7385f, 4.4124f, 7.7438f, 4.3967f, 7.7628f, 4.3398f)
                lineTo(7.8744f, 4.0049f)
                curveTo(7.9427f, 3.7996f, 8.0022f, 3.6207f, 8.0855f, 3.4608f)
                curveTo(8.4144f, 2.8291f, 9.023f, 2.3904f, 9.7263f, 2.2781f)
                curveTo(9.9044f, 2.2497f, 10.0929f, 2.2498f, 10.3093f, 2.25f)
                close()
                moveTo(9.0081f, 5.25f)
                curveTo(9.0596f, 5.149f, 9.1052f, 5.044f, 9.1445f, 4.9354f)
                curveTo(9.1564f, 4.9025f, 9.1681f, 4.8674f, 9.1831f, 4.8223f)
                lineTo(9.2829f, 4.5229f)
                curveTo(9.3741f, 4.2494f, 9.3951f, 4.1936f, 9.4159f, 4.1536f)
                curveTo(9.5256f, 3.943f, 9.7284f, 3.7968f, 9.9629f, 3.7594f)
                curveTo(10.0074f, 3.7522f, 10.0669f, 3.75f, 10.3553f, 3.75f)
                horizontalLineTo(13.6447f)
                curveTo(13.933f, 3.75f, 13.9926f, 3.7522f, 14.0371f, 3.7594f)
                curveTo(14.2716f, 3.7968f, 14.4744f, 3.943f, 14.5841f, 4.1536f)
                curveTo(14.6049f, 4.1936f, 14.6259f, 4.2493f, 14.7171f, 4.5229f)
                lineTo(14.8168f, 4.8221f)
                lineTo(14.8555f, 4.9354f)
                curveTo(14.8948f, 5.044f, 14.9404f, 5.149f, 14.9919f, 5.25f)
                horizontalLineTo(9.0081f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.915f, 8.4501f)
                curveTo(5.8874f, 8.0368f, 5.5301f, 7.7241f, 5.1168f, 7.7516f)
                curveTo(4.7035f, 7.7792f, 4.3908f, 8.1366f, 4.4183f, 8.5499f)
                lineTo(4.8818f, 15.5016f)
                curveTo(4.9673f, 16.7843f, 5.0363f, 17.8205f, 5.1983f, 18.6336f)
                curveTo(5.3667f, 19.4789f, 5.6531f, 20.1849f, 6.2447f, 20.7384f)
                curveTo(6.8363f, 21.2919f, 7.5599f, 21.5307f, 8.4145f, 21.6425f)
                curveTo(9.2365f, 21.75f, 10.275f, 21.75f, 11.5605f, 21.75f)
                horizontalLineTo(12.4394f)
                curveTo(13.725f, 21.75f, 14.7635f, 21.75f, 15.5855f, 21.6425f)
                curveTo(16.4401f, 21.5307f, 17.1637f, 21.2919f, 17.7553f, 20.7384f)
                curveTo(18.3469f, 20.1849f, 18.6333f, 19.4789f, 18.8017f, 18.6336f)
                curveTo(18.9637f, 17.8205f, 19.0327f, 16.7844f, 19.1182f, 15.5016f)
                lineTo(19.5817f, 8.5499f)
                curveTo(19.6092f, 8.1366f, 19.2965f, 7.7792f, 18.8832f, 7.7516f)
                curveTo(18.4699f, 7.7241f, 18.1125f, 8.0368f, 18.085f, 8.4501f)
                lineTo(17.625f, 15.3492f)
                curveTo(17.5352f, 16.6971f, 17.4712f, 17.6349f, 17.3306f, 18.3405f)
                curveTo(17.1942f, 19.0249f, 17.0039f, 19.3872f, 16.7305f, 19.643f)
                curveTo(16.4571f, 19.8988f, 16.0829f, 20.0646f, 15.3909f, 20.1552f)
                curveTo(14.6775f, 20.2485f, 13.7375f, 20.25f, 12.3867f, 20.25f)
                horizontalLineTo(11.6133f)
                curveTo(10.2625f, 20.25f, 9.3225f, 20.2485f, 8.6091f, 20.1552f)
                curveTo(7.9171f, 20.0646f, 7.5429f, 19.8988f, 7.2695f, 19.643f)
                curveTo(6.9961f, 19.3872f, 6.8057f, 19.0249f, 6.6694f, 18.3405f)
                curveTo(6.5288f, 17.6349f, 6.4648f, 16.6971f, 6.3749f, 15.3492f)
                lineTo(5.915f, 8.4501f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.4254f, 10.2537f)
                curveTo(9.8375f, 10.2125f, 10.2051f, 10.5132f, 10.2463f, 10.9253f)
                lineTo(10.7463f, 15.9253f)
                curveTo(10.7875f, 16.3375f, 10.4868f, 16.705f, 10.0746f, 16.7463f)
                curveTo(9.6625f, 16.7875f, 9.2949f, 16.4868f, 9.2537f, 16.0746f)
                lineTo(8.7537f, 11.0746f)
                curveTo(8.7125f, 10.6624f, 9.0132f, 10.2949f, 9.4254f, 10.2537f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5746f, 10.2537f)
                curveTo(14.9868f, 10.2949f, 15.2875f, 10.6624f, 15.2463f, 11.0746f)
                lineTo(14.7463f, 16.0746f)
                curveTo(14.7051f, 16.4868f, 14.3375f, 16.7875f, 13.9254f, 16.7463f)
                curveTo(13.5132f, 16.705f, 13.2125f, 16.3375f, 13.2537f, 15.9253f)
                lineTo(13.7537f, 10.9253f)
                curveTo(13.7949f, 10.5132f, 14.1625f, 10.2125f, 14.5746f, 10.2537f)
                close()
            }
        }
            .build()
        return _trashBinTrash!!
    }

private var _trashBinTrash: ImageVector? = null
