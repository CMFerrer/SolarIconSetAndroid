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

val EssentionalUiGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(
            name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.25f)
                curveTo(12.4142f, 12.25f, 12.75f, 12.5858f, 12.75f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(12.75f, 15.4142f, 12.4142f, 15.75f, 12.0f, 15.75f)
                curveTo(11.5858f, 15.75f, 11.25f, 15.4142f, 11.25f, 15.0f)
                verticalLineTo(13.0f)
                curveTo(11.25f, 12.5858f, 11.5858f, 12.25f, 12.0f, 12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.9553f, 1.25f)
                curveTo(5.5224f, 1.25f, 5.1256f, 1.2499f, 4.8028f, 1.2933f)
                curveTo(4.4473f, 1.3411f, 4.0716f, 1.4535f, 3.7626f, 1.7626f)
                curveTo(3.4536f, 2.0716f, 3.3411f, 2.4473f, 3.2933f, 2.8028f)
                curveTo(3.2499f, 3.1256f, 3.2499f, 3.5224f, 3.25f, 3.9553f)
                lineTo(3.25f, 4.1716f)
                lineTo(3.2499f, 4.2516f)
                curveTo(3.2489f, 4.5773f, 3.2479f, 4.9288f, 3.3832f, 5.2555f)
                curveTo(3.5185f, 5.5822f, 3.7678f, 5.83f, 3.9987f, 6.0596f)
                lineTo(4.0555f, 6.1161f)
                lineTo(7.2981f, 9.3588f)
                curveTo(7.9194f, 9.9801f, 8.073f, 10.1524f, 8.1549f, 10.3501f)
                curveTo(8.2367f, 10.5477f, 8.25f, 10.7782f, 8.25f, 11.6569f)
                verticalLineTo(19.0253f)
                curveTo(8.25f, 19.4697f, 8.25f, 19.8408f, 8.2708f, 20.1454f)
                curveTo(8.2924f, 20.4625f, 8.3391f, 20.762f, 8.4593f, 21.0524f)
                curveTo(8.7385f, 21.7262f, 9.2738f, 22.2616f, 9.9476f, 22.5407f)
                curveTo(10.238f, 22.661f, 10.5375f, 22.7076f, 10.8546f, 22.7292f)
                curveTo(11.1593f, 22.75f, 11.5303f, 22.75f, 11.9747f, 22.75f)
                horizontalLineTo(12.0253f)
                curveTo(12.4697f, 22.75f, 12.8408f, 22.75f, 13.1454f, 22.7292f)
                curveTo(13.4625f, 22.7076f, 13.762f, 22.661f, 14.0524f, 22.5407f)
                curveTo(14.7262f, 22.2616f, 15.2616f, 21.7262f, 15.5407f, 21.0524f)
                curveTo(15.661f, 20.762f, 15.7076f, 20.4625f, 15.7292f, 20.1454f)
                curveTo(15.75f, 19.8408f, 15.75f, 19.4697f, 15.75f, 19.0253f)
                verticalLineTo(11.6569f)
                curveTo(15.75f, 10.7782f, 15.7633f, 10.5477f, 15.8452f, 10.3501f)
                curveTo(15.927f, 10.1524f, 16.0806f, 9.9801f, 16.7019f, 9.3588f)
                lineTo(19.9446f, 6.1161f)
                lineTo(20.0013f, 6.0596f)
                curveTo(20.2322f, 5.83f, 20.4815f, 5.5822f, 20.6168f, 5.2555f)
                curveTo(20.7521f, 4.9288f, 20.7511f, 4.5773f, 20.7502f, 4.2516f)
                lineTo(20.75f, 4.1716f)
                lineTo(20.75f, 3.9553f)
                curveTo(20.7501f, 3.5224f, 20.7501f, 3.1256f, 20.7067f, 2.8028f)
                curveTo(20.6589f, 2.4473f, 20.5465f, 2.0716f, 20.2374f, 1.7626f)
                curveTo(19.9284f, 1.4535f, 19.5527f, 1.3411f, 19.1972f, 1.2933f)
                curveTo(18.8744f, 1.2499f, 18.4776f, 1.25f, 18.0448f, 1.25f)
                horizontalLineTo(5.9553f)
                close()
                moveTo(4.8257f, 2.8219f)
                lineTo(4.8232f, 2.8232f)
                lineTo(4.8219f, 2.8257f)
                curveTo(4.8209f, 2.8276f, 4.8192f, 2.8309f, 4.8172f, 2.836f)
                curveTo(4.8082f, 2.8577f, 4.7929f, 2.9061f, 4.7799f, 3.0027f)
                curveTo(4.7516f, 3.2134f, 4.75f, 3.5074f, 4.75f, 4.0f)
                verticalLineTo(4.1716f)
                curveTo(4.75f, 4.1992f, 4.75f, 4.2253f, 4.75f, 4.25f)
                horizontalLineTo(19.25f)
                curveTo(19.25f, 4.2253f, 19.25f, 4.1992f, 19.25f, 4.1716f)
                verticalLineTo(4.0f)
                curveTo(19.25f, 3.5074f, 19.2484f, 3.2134f, 19.2201f, 3.0027f)
                curveTo(19.2071f, 2.9061f, 19.1918f, 2.8577f, 19.1828f, 2.836f)
                curveTo(19.1808f, 2.8309f, 19.1792f, 2.8276f, 19.1781f, 2.8257f)
                lineTo(19.1768f, 2.8232f)
                lineTo(19.1743f, 2.8219f)
                curveTo(19.1724f, 2.8209f, 19.1691f, 2.8192f, 19.164f, 2.8172f)
                curveTo(19.1423f, 2.8082f, 19.0939f, 2.7929f, 18.9973f, 2.7799f)
                curveTo(18.7866f, 2.7516f, 18.4926f, 2.75f, 18.0f, 2.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5074f, 2.75f, 5.2134f, 2.7516f, 5.0027f, 2.7799f)
                curveTo(4.9061f, 2.7929f, 4.8577f, 2.8082f, 4.836f, 2.8172f)
                curveTo(4.8309f, 2.8192f, 4.8276f, 2.8209f, 4.8257f, 2.8219f)
                close()
                moveTo(18.1894f, 5.75f)
                horizontalLineTo(5.8107f)
                lineTo(8.4443f, 8.3835f)
                curveTo(8.7562f, 8.6948f, 9.0271f, 8.9652f, 9.2374f, 9.25f)
                horizontalLineTo(14.7626f)
                curveTo(14.9729f, 8.9652f, 15.2438f, 8.6948f, 15.5557f, 8.3835f)
                lineTo(18.1894f, 5.75f)
                close()
                moveTo(14.2633f, 10.75f)
                horizontalLineTo(9.7367f)
                curveTo(9.7506f, 10.9925f, 9.7504f, 11.2522f, 9.7501f, 11.536f)
                lineTo(9.75f, 19.0f)
                curveTo(9.75f, 19.4762f, 9.7504f, 19.7958f, 9.7673f, 20.0433f)
                curveTo(9.7837f, 20.284f, 9.8132f, 20.4012f, 9.8452f, 20.4784f)
                curveTo(9.972f, 20.7846f, 10.2154f, 21.028f, 10.5217f, 21.1549f)
                curveTo(10.5988f, 21.1868f, 10.716f, 21.2163f, 10.9567f, 21.2327f)
                curveTo(11.2042f, 21.2496f, 11.5238f, 21.25f, 12.0f, 21.25f)
                curveTo(12.4762f, 21.25f, 12.7958f, 21.2496f, 13.0433f, 21.2327f)
                curveTo(13.284f, 21.2163f, 13.4012f, 21.1868f, 13.4784f, 21.1549f)
                curveTo(13.7846f, 21.028f, 14.028f, 20.7846f, 14.1549f, 20.4784f)
                curveTo(14.1868f, 20.4012f, 14.2163f, 20.284f, 14.2327f, 20.0433f)
                curveTo(14.2496f, 19.7958f, 14.25f, 19.4762f, 14.25f, 19.0f)
                lineTo(14.2499f, 11.536f)
                curveTo(14.2497f, 11.2522f, 14.2494f, 10.9925f, 14.2633f, 10.75f)
                close()
            }
        }
            .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
