package dev.chiksmedina.solar.bold.electronicdevices

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
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.SsdRound: ImageVector
    get() {
        if (_ssdRound != null) {
            return _ssdRound!!
        }
        _ssdRound = Builder(
            name = "SsdRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.8421f, 13.3763f)
                curveTo(19.9675f, 13.3763f, 20.9827f, 13.8287f, 21.7332f, 14.5574f)
                lineTo(19.3684f, 5.1782f)
                curveTo(18.8421f, 3.5445f, 17.8995f, 3.0f, 16.7368f, 3.0f)
                horizontalLineTo(7.2632f)
                curveTo(6.1005f, 3.0f, 5.1579f, 3.5445f, 4.6316f, 5.1782f)
                lineTo(2.2668f, 14.5574f)
                curveTo(3.0173f, 13.8287f, 4.0325f, 13.3763f, 5.1579f, 13.3763f)
                horizontalLineTo(18.8421f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.1579f, 14.4049f)
                curveTo(3.991f, 14.4049f, 2.9576f, 15.0684f, 2.4087f, 16.0789f)
                curveTo(2.1492f, 16.5568f, 2.0f, 17.1102f, 2.0f, 17.7025f)
                curveTo(2.0f, 19.5517f, 3.4418f, 21.0f, 5.1579f, 21.0f)
                horizontalLineTo(18.8421f)
                curveTo(20.5582f, 21.0f, 22.0f, 19.5517f, 22.0f, 17.7025f)
                curveTo(22.0f, 17.1102f, 21.8508f, 16.5568f, 21.5913f, 16.0789f)
                curveTo(21.0425f, 15.0684f, 20.009f, 14.4049f, 18.8421f, 14.4049f)
                horizontalLineTo(5.1579f)
                close()
                moveTo(11.2105f, 17.4003f)
                curveTo(11.2105f, 16.9742f, 10.8571f, 16.6288f, 10.4211f, 16.6288f)
                curveTo(9.985f, 16.6288f, 9.6316f, 16.9742f, 9.6316f, 17.4003f)
                verticalLineTo(18.4289f)
                curveTo(9.6316f, 18.8549f, 9.985f, 19.2003f, 10.4211f, 19.2003f)
                curveTo(10.8571f, 19.2003f, 11.2105f, 18.8549f, 11.2105f, 18.4289f)
                verticalLineTo(17.4003f)
                close()
                moveTo(13.0526f, 16.6288f)
                curveTo(13.4886f, 16.6288f, 13.8421f, 16.9742f, 13.8421f, 17.4003f)
                verticalLineTo(18.4289f)
                curveTo(13.8421f, 18.8549f, 13.4886f, 19.2003f, 13.0526f, 19.2003f)
                curveTo(12.6166f, 19.2003f, 12.2632f, 18.8549f, 12.2632f, 18.4289f)
                verticalLineTo(17.4003f)
                curveTo(12.2632f, 16.9742f, 12.6166f, 16.6288f, 13.0526f, 16.6288f)
                close()
                moveTo(16.4737f, 17.4003f)
                curveTo(16.4737f, 16.9742f, 16.1202f, 16.6288f, 15.6842f, 16.6288f)
                curveTo(15.2482f, 16.6288f, 14.8947f, 16.9742f, 14.8947f, 17.4003f)
                verticalLineTo(18.4289f)
                curveTo(14.8947f, 18.8549f, 15.2482f, 19.2003f, 15.6842f, 19.2003f)
                curveTo(16.1202f, 19.2003f, 16.4737f, 18.8549f, 16.4737f, 18.4289f)
                verticalLineTo(17.4003f)
                close()
                moveTo(19.1053f, 17.4003f)
                curveTo(19.1053f, 16.9742f, 18.7518f, 16.6288f, 18.3158f, 16.6288f)
                curveTo(17.8798f, 16.6288f, 17.5263f, 16.9742f, 17.5263f, 17.4003f)
                verticalLineTo(18.4289f)
                curveTo(17.5263f, 18.8549f, 17.8798f, 19.2003f, 18.3158f, 19.2003f)
                curveTo(18.7518f, 19.2003f, 19.1053f, 18.8549f, 19.1053f, 18.4289f)
                verticalLineTo(17.4003f)
                close()
            }
        }
            .build()
        return _ssdRound!!
    }

private var _ssdRound: ImageVector? = null
