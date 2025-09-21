package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.BillList: ImageVector
    get() {
        if (_billList != null) {
            return _billList!!
        }
        _billList = Builder(
            name = "BillList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0987f, 1.25f)
                curveTo(7.1468f, 1.2501f, 7.1955f, 1.2501f, 7.245f, 1.2501f)
                horizontalLineTo(16.755f)
                curveTo(16.8045f, 1.2501f, 16.8532f, 1.2501f, 16.9013f, 1.25f)
                curveTo(17.918f, 1.2496f, 18.6178f, 1.2493f, 19.2071f, 1.4543f)
                curveTo(20.3201f, 1.8416f, 21.1842f, 2.7373f, 21.5546f, 3.8656f)
                lineTo(20.8421f, 4.0995f)
                lineTo(21.5546f, 3.8656f)
                curveTo(21.7507f, 4.4627f, 21.7504f, 5.1725f, 21.75f, 6.2266f)
                curveTo(21.75f, 6.2737f, 21.75f, 6.3216f, 21.75f, 6.3701f)
                verticalLineTo(20.3743f)
                curveTo(21.75f, 21.8395f, 20.023f, 22.7118f, 18.8856f, 21.671f)
                curveTo(18.8061f, 21.5983f, 18.6939f, 21.5983f, 18.6144f, 21.671f)
                lineTo(18.1313f, 22.1131f)
                curveTo(17.2031f, 22.9624f, 15.7969f, 22.9624f, 14.8687f, 22.1131f)
                curveTo(14.5137f, 21.7882f, 13.9863f, 21.7882f, 13.6313f, 22.1131f)
                curveTo(12.7031f, 22.9624f, 11.2969f, 22.9624f, 10.3687f, 22.1131f)
                curveTo(10.0137f, 21.7882f, 9.4863f, 21.7882f, 9.1313f, 22.1131f)
                curveTo(8.2031f, 22.9624f, 6.7969f, 22.9624f, 5.8687f, 22.1131f)
                lineTo(5.3856f, 21.671f)
                curveTo(5.3061f, 21.5983f, 5.1939f, 21.5983f, 5.1144f, 21.671f)
                curveTo(3.977f, 22.7118f, 2.25f, 21.8395f, 2.25f, 20.3743f)
                verticalLineTo(6.3701f)
                curveTo(2.25f, 6.3216f, 2.25f, 6.2737f, 2.25f, 6.2266f)
                curveTo(2.2496f, 5.1726f, 2.2493f, 4.4627f, 2.4454f, 3.8656f)
                curveTo(2.8159f, 2.7373f, 3.68f, 1.8416f, 4.7929f, 1.4543f)
                curveTo(5.3822f, 1.2493f, 6.082f, 1.2496f, 7.0987f, 1.25f)
                close()
                moveTo(7.245f, 2.7501f)
                curveTo(6.0239f, 2.7501f, 5.6033f, 2.7606f, 5.2859f, 2.871f)
                curveTo(4.6265f, 3.1005f, 4.0991f, 3.6373f, 3.8705f, 4.3335f)
                curveTo(3.7594f, 4.6718f, 3.75f, 5.118f, 3.75f, 6.3701f)
                verticalLineTo(20.3743f)
                curveTo(3.75f, 20.4933f, 3.8099f, 20.5661f, 3.8851f, 20.6009f)
                curveTo(3.9243f, 20.619f, 3.9626f, 20.6237f, 3.9945f, 20.6194f)
                curveTo(4.0226f, 20.6156f, 4.059f, 20.6035f, 4.1018f, 20.5644f)
                curveTo(4.7545f, 19.9671f, 5.7456f, 19.9671f, 6.3982f, 20.5644f)
                lineTo(6.8813f, 21.0065f)
                curveTo(7.2363f, 21.3313f, 7.7637f, 21.3313f, 8.1187f, 21.0065f)
                curveTo(9.0469f, 20.1571f, 10.4531f, 20.1571f, 11.3813f, 21.0065f)
                curveTo(11.7363f, 21.3313f, 12.2637f, 21.3313f, 12.6187f, 21.0065f)
                curveTo(13.5469f, 20.1571f, 14.9531f, 20.1571f, 15.8813f, 21.0065f)
                curveTo(16.2363f, 21.3313f, 16.7637f, 21.3313f, 17.1187f, 21.0065f)
                lineTo(17.6018f, 20.5644f)
                curveTo(18.2545f, 19.9671f, 19.2455f, 19.9671f, 19.8982f, 20.5644f)
                curveTo(19.941f, 20.6035f, 19.9774f, 20.6156f, 20.0055f, 20.6194f)
                curveTo(20.0374f, 20.6237f, 20.0757f, 20.619f, 20.1149f, 20.6009f)
                curveTo(20.1901f, 20.5661f, 20.25f, 20.4934f, 20.25f, 20.3743f)
                verticalLineTo(6.3701f)
                curveTo(20.25f, 5.118f, 20.2406f, 4.6718f, 20.1295f, 4.3335f)
                curveTo(19.9009f, 3.6373f, 19.3735f, 3.1005f, 18.7141f, 2.871f)
                curveTo(18.3967f, 2.7606f, 17.9761f, 2.7501f, 16.755f, 2.7501f)
                horizontalLineTo(7.245f)
                close()
                moveTo(6.25f, 7.5001f)
                curveTo(6.25f, 7.0859f, 6.5858f, 6.7501f, 7.0f, 6.7501f)
                horizontalLineTo(7.5f)
                curveTo(7.9142f, 6.7501f, 8.25f, 7.0859f, 8.25f, 7.5001f)
                curveTo(8.25f, 7.9143f, 7.9142f, 8.2501f, 7.5f, 8.2501f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 8.2501f, 6.25f, 7.9143f, 6.25f, 7.5001f)
                close()
                moveTo(9.75f, 7.5001f)
                curveTo(9.75f, 7.0859f, 10.0858f, 6.7501f, 10.5f, 6.7501f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 6.7501f, 17.75f, 7.0859f, 17.75f, 7.5001f)
                curveTo(17.75f, 7.9143f, 17.4142f, 8.2501f, 17.0f, 8.2501f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 8.2501f, 9.75f, 7.9143f, 9.75f, 7.5001f)
                close()
                moveTo(6.25f, 11.0001f)
                curveTo(6.25f, 10.5859f, 6.5858f, 10.2501f, 7.0f, 10.2501f)
                horizontalLineTo(7.5f)
                curveTo(7.9142f, 10.2501f, 8.25f, 10.5859f, 8.25f, 11.0001f)
                curveTo(8.25f, 11.4143f, 7.9142f, 11.7501f, 7.5f, 11.7501f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 11.7501f, 6.25f, 11.4143f, 6.25f, 11.0001f)
                close()
                moveTo(9.75f, 11.0001f)
                curveTo(9.75f, 10.5859f, 10.0858f, 10.2501f, 10.5f, 10.2501f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 10.2501f, 17.75f, 10.5859f, 17.75f, 11.0001f)
                curveTo(17.75f, 11.4143f, 17.4142f, 11.7501f, 17.0f, 11.7501f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 11.7501f, 9.75f, 11.4143f, 9.75f, 11.0001f)
                close()
                moveTo(6.25f, 14.5001f)
                curveTo(6.25f, 14.0859f, 6.5858f, 13.7501f, 7.0f, 13.7501f)
                horizontalLineTo(7.5f)
                curveTo(7.9142f, 13.7501f, 8.25f, 14.0859f, 8.25f, 14.5001f)
                curveTo(8.25f, 14.9143f, 7.9142f, 15.2501f, 7.5f, 15.2501f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 15.2501f, 6.25f, 14.9143f, 6.25f, 14.5001f)
                close()
                moveTo(9.75f, 14.5001f)
                curveTo(9.75f, 14.0859f, 10.0858f, 13.7501f, 10.5f, 13.7501f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 13.7501f, 17.75f, 14.0859f, 17.75f, 14.5001f)
                curveTo(17.75f, 14.9143f, 17.4142f, 15.2501f, 17.0f, 15.2501f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 15.2501f, 9.75f, 14.9143f, 9.75f, 14.5001f)
                close()
            }
        }
            .build()
        return _billList!!
    }

private var _billList: ImageVector? = null
