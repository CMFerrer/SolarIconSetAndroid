package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.FlashlightOn: ImageVector
    get() {
        if (_flashlightOn != null) {
            return _flashlightOn!!
        }
        _flashlightOn = Builder(name = "FlashlightOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(12.75f, 5.4142f, 12.4142f, 5.75f, 12.0f, 5.75f)
                curveTo(11.5858f, 5.75f, 11.25f, 5.4142f, 11.25f, 5.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.9553f, 7.25f)
                horizontalLineTo(18.0448f)
                curveTo(18.4776f, 7.2499f, 18.8744f, 7.2499f, 19.1972f, 7.2933f)
                curveTo(19.5527f, 7.3411f, 19.9284f, 7.4535f, 20.2374f, 7.7626f)
                curveTo(20.5465f, 8.0716f, 20.6589f, 8.4473f, 20.7067f, 8.8028f)
                curveTo(20.7501f, 9.1256f, 20.7501f, 9.5224f, 20.75f, 9.9553f)
                lineTo(20.75f, 10.1716f)
                lineTo(20.7502f, 10.2516f)
                curveTo(20.7511f, 10.5773f, 20.7521f, 10.9288f, 20.6168f, 11.2555f)
                curveTo(20.4815f, 11.5822f, 20.2322f, 11.83f, 20.0013f, 12.0596f)
                lineTo(19.9446f, 12.1161f)
                lineTo(16.7019f, 15.3588f)
                curveTo(16.0806f, 15.9801f, 15.927f, 16.1524f, 15.8452f, 16.3501f)
                curveTo(15.7633f, 16.5477f, 15.75f, 16.7782f, 15.75f, 17.6569f)
                verticalLineTo(22.0f)
                curveTo(15.75f, 22.4142f, 15.4142f, 22.75f, 15.0f, 22.75f)
                curveTo(14.5858f, 22.75f, 14.25f, 22.4142f, 14.25f, 22.0f)
                lineTo(14.2499f, 17.536f)
                curveTo(14.2497f, 17.2522f, 14.2494f, 16.9925f, 14.2633f, 16.75f)
                horizontalLineTo(9.7367f)
                curveTo(9.7506f, 16.9925f, 9.7504f, 17.2522f, 9.7501f, 17.536f)
                lineTo(9.75f, 22.0f)
                curveTo(9.75f, 22.4142f, 9.4142f, 22.75f, 9.0f, 22.75f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                verticalLineTo(17.6569f)
                curveTo(8.25f, 16.7782f, 8.2367f, 16.5477f, 8.1549f, 16.3501f)
                curveTo(8.073f, 16.1524f, 7.9194f, 15.9801f, 7.2981f, 15.3588f)
                lineTo(4.0555f, 12.1161f)
                lineTo(3.9987f, 12.0596f)
                curveTo(3.7678f, 11.83f, 3.5185f, 11.5822f, 3.3832f, 11.2555f)
                curveTo(3.2479f, 10.9288f, 3.2489f, 10.5773f, 3.2499f, 10.2516f)
                lineTo(3.25f, 10.1716f)
                lineTo(3.25f, 9.9553f)
                curveTo(3.2499f, 9.5224f, 3.2499f, 9.1256f, 3.2933f, 8.8028f)
                curveTo(3.3411f, 8.4473f, 3.4536f, 8.0716f, 3.7626f, 7.7626f)
                curveTo(4.0716f, 7.4535f, 4.4473f, 7.3411f, 4.8028f, 7.2933f)
                curveTo(5.1256f, 7.2499f, 5.5224f, 7.2499f, 5.9553f, 7.25f)
                close()
                moveTo(15.5557f, 14.3835f)
                curveTo(15.2438f, 14.6948f, 14.9729f, 14.9652f, 14.7626f, 15.25f)
                horizontalLineTo(9.2374f)
                curveTo(9.0271f, 14.9652f, 8.7562f, 14.6948f, 8.4443f, 14.3835f)
                lineTo(5.8107f, 11.75f)
                horizontalLineTo(18.1894f)
                lineTo(15.5557f, 14.3835f)
                close()
                moveTo(19.25f, 10.25f)
                lineTo(19.25f, 10.0f)
                curveTo(19.25f, 9.5074f, 19.2484f, 9.2134f, 19.2201f, 9.0027f)
                curveTo(19.2071f, 8.9061f, 19.1918f, 8.8577f, 19.1828f, 8.836f)
                lineTo(19.1803f, 8.83f)
                lineTo(19.1781f, 8.8257f)
                lineTo(19.1768f, 8.8232f)
                lineTo(19.1743f, 8.8219f)
                lineTo(19.1701f, 8.8198f)
                lineTo(19.164f, 8.8172f)
                curveTo(19.1423f, 8.8082f, 19.0939f, 8.7929f, 18.9973f, 8.7799f)
                curveTo(18.7866f, 8.7516f, 18.4926f, 8.75f, 18.0f, 8.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5074f, 8.75f, 5.2134f, 8.7516f, 5.0027f, 8.7799f)
                curveTo(4.9061f, 8.7929f, 4.8577f, 8.8082f, 4.836f, 8.8172f)
                curveTo(4.8309f, 8.8192f, 4.8276f, 8.8209f, 4.8257f, 8.8219f)
                lineTo(4.8232f, 8.8232f)
                lineTo(4.8219f, 8.8257f)
                curveTo(4.8209f, 8.8276f, 4.8192f, 8.8309f, 4.8172f, 8.836f)
                curveTo(4.8082f, 8.8577f, 4.7929f, 8.9061f, 4.7799f, 9.0027f)
                curveTo(4.7516f, 9.2134f, 4.75f, 9.5074f, 4.75f, 10.0f)
                lineTo(4.75f, 10.25f)
                horizontalLineTo(19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5303f, 2.4697f)
                curveTo(6.2374f, 2.1768f, 5.7626f, 2.1768f, 5.4697f, 2.4697f)
                curveTo(5.1768f, 2.7626f, 5.1768f, 3.2374f, 5.4697f, 3.5303f)
                lineTo(7.4697f, 5.5303f)
                curveTo(7.7626f, 5.8232f, 8.2374f, 5.8232f, 8.5303f, 5.5303f)
                curveTo(8.8232f, 5.2374f, 8.8232f, 4.7626f, 8.5303f, 4.4697f)
                lineTo(6.5303f, 2.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5303f, 2.4697f)
                curveTo(18.2374f, 2.1768f, 17.7626f, 2.1768f, 17.4697f, 2.4697f)
                lineTo(15.4697f, 4.4697f)
                curveTo(15.1768f, 4.7626f, 15.1768f, 5.2374f, 15.4697f, 5.5303f)
                curveTo(15.7626f, 5.8232f, 16.2374f, 5.8232f, 16.5303f, 5.5303f)
                lineTo(18.5303f, 3.5303f)
                curveTo(18.8232f, 3.2374f, 18.8232f, 2.7626f, 18.5303f, 2.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 19.0f)
                curveTo(12.75f, 18.5858f, 12.4142f, 18.25f, 12.0f, 18.25f)
                curveTo(11.5858f, 18.25f, 11.25f, 18.5858f, 11.25f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(11.25f, 21.4142f, 11.5858f, 21.75f, 12.0f, 21.75f)
                curveTo(12.4142f, 21.75f, 12.75f, 21.4142f, 12.75f, 21.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _flashlightOn!!
    }

private var _flashlightOn: ImageVector? = null
