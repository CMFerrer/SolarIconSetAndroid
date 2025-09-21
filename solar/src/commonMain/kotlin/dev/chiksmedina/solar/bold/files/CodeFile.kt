package dev.chiksmedina.solar.bold.files

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
import dev.chiksmedina.solar.bold.FilesGroup

val FilesGroup.CodeFile: ImageVector
    get() {
        if (_codeFile != null) {
            return _codeFile!!
        }
        _codeFile = Builder(
            name = "CodeFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.3517f, 7.6167f)
                lineTo(15.3929f, 4.0538f)
                curveTo(14.2651f, 3.0387f, 13.7012f, 2.5311f, 13.0092f, 2.2656f)
                lineTo(13.0f, 5.0001f)
                curveTo(13.0f, 7.3571f, 13.0f, 8.5356f, 13.7322f, 9.2679f)
                curveTo(14.4645f, 10.0001f, 15.643f, 10.0001f, 18.0f, 10.0001f)
                horizontalLineTo(21.5801f)
                curveTo(21.2175f, 9.2959f, 20.5684f, 8.7116f, 19.3517f, 7.6167f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                verticalLineTo(13.5629f)
                curveTo(22.0f, 12.6901f, 22.0f, 12.0344f, 21.9574f, 11.5001f)
                horizontalLineTo(18.0f)
                lineTo(17.9051f, 11.5001f)
                curveTo(16.808f, 11.5002f, 15.8385f, 11.5003f, 15.0569f, 11.3952f)
                curveTo(14.2098f, 11.2813f, 13.3628f, 11.0198f, 12.6716f, 10.3285f)
                curveTo(11.9803f, 9.6373f, 11.7188f, 8.7903f, 11.6049f, 7.9432f)
                curveTo(11.4998f, 7.1616f, 11.4999f, 6.1921f, 11.5f, 5.095f)
                lineTo(11.5092f, 2.2606f)
                curveTo(11.5095f, 2.1781f, 11.5166f, 2.0966f, 11.53f, 2.0167f)
                curveTo(11.1214f, 2.0f, 10.6358f, 2.0f, 10.0298f, 2.0f)
                curveTo(6.2387f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                close()
                moveTo(10.9697f, 15.4697f)
                curveTo(11.2626f, 15.1768f, 11.7374f, 15.1768f, 12.0303f, 15.4697f)
                lineTo(13.0303f, 16.4697f)
                curveTo(13.3232f, 16.7626f, 13.3232f, 17.2374f, 13.0303f, 17.5303f)
                lineTo(12.0303f, 18.5303f)
                curveTo(11.7374f, 18.8232f, 11.2626f, 18.8232f, 10.9697f, 18.5303f)
                curveTo(10.6768f, 18.2374f, 10.6768f, 17.7626f, 10.9697f, 17.4697f)
                lineTo(11.4393f, 17.0f)
                lineTo(10.9697f, 16.5303f)
                curveTo(10.6768f, 16.2374f, 10.6768f, 15.7626f, 10.9697f, 15.4697f)
                close()
                moveTo(10.7022f, 14.2633f)
                curveTo(10.8477f, 13.8755f, 10.6512f, 13.4432f, 10.2633f, 13.2978f)
                curveTo(9.8755f, 13.1523f, 9.4432f, 13.3488f, 9.2978f, 13.7367f)
                lineTo(7.7977f, 17.7367f)
                curveTo(7.6523f, 18.1245f, 7.8488f, 18.5568f, 8.2367f, 18.7022f)
                curveTo(8.6245f, 18.8477f, 9.0568f, 18.6512f, 9.2022f, 18.2633f)
                lineTo(10.7022f, 14.2633f)
                close()
                moveTo(7.5303f, 13.4697f)
                curveTo(7.8232f, 13.7626f, 7.8232f, 14.2374f, 7.5303f, 14.5303f)
                lineTo(7.0607f, 15.0f)
                lineTo(7.5303f, 15.4697f)
                curveTo(7.8232f, 15.7626f, 7.8232f, 16.2374f, 7.5303f, 16.5303f)
                curveTo(7.2374f, 16.8232f, 6.7626f, 16.8232f, 6.4697f, 16.5303f)
                lineTo(5.4697f, 15.5303f)
                curveTo(5.1768f, 15.2374f, 5.1768f, 14.7626f, 5.4697f, 14.4697f)
                lineTo(6.4697f, 13.4697f)
                curveTo(6.7626f, 13.1768f, 7.2374f, 13.1768f, 7.5303f, 13.4697f)
                close()
            }
        }
            .build()
        return _codeFile!!
    }

private var _codeFile: ImageVector? = null
