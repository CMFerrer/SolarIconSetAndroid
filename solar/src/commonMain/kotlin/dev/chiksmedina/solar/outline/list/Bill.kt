package dev.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ListGroup

val ListGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(
            name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 2.0f)
                curveTo(1.25f, 1.5858f, 1.5858f, 1.25f, 2.0f, 1.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 1.25f, 22.75f, 1.5858f, 22.75f, 2.0f)
                curveTo(22.75f, 2.4142f, 22.4142f, 2.75f, 22.0f, 2.75f)
                horizontalLineTo(20.75f)
                verticalLineTo(12.27f)
                curveTo(20.75f, 12.3228f, 20.75f, 12.3749f, 20.7501f, 12.4264f)
                curveTo(20.7507f, 13.6132f, 20.7511f, 14.4386f, 20.4148f, 15.1792f)
                curveTo(20.0785f, 15.9197f, 19.4567f, 16.4628f, 18.5625f, 17.2439f)
                curveTo(18.5238f, 17.2777f, 18.4845f, 17.312f, 18.4447f, 17.3468f)
                lineTo(16.4067f, 19.1288f)
                curveTo(15.4977f, 19.9236f, 14.762f, 20.5669f, 14.111f, 21.005f)
                curveTo(13.4333f, 21.461f, 12.7697f, 21.75f, 12.0f, 21.75f)
                curveTo(11.2303f, 21.75f, 10.5668f, 21.461f, 9.889f, 21.005f)
                curveTo(9.238f, 20.5669f, 8.5023f, 19.9236f, 7.5933f, 19.1288f)
                lineTo(5.5553f, 17.3468f)
                curveTo(5.5155f, 17.312f, 5.4762f, 17.2777f, 5.4375f, 17.2439f)
                curveTo(4.5433f, 16.4628f, 3.9215f, 15.9197f, 3.5852f, 15.1792f)
                curveTo(3.2489f, 14.4386f, 3.2493f, 13.6132f, 3.2499f, 12.4264f)
                curveTo(3.25f, 12.3749f, 3.25f, 12.3228f, 3.25f, 12.27f)
                verticalLineTo(2.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 2.75f, 1.25f, 2.4142f, 1.25f, 2.0f)
                close()
                moveTo(4.75f, 2.75f)
                verticalLineTo(12.27f)
                curveTo(4.75f, 13.6768f, 4.7657f, 14.1509f, 4.951f, 14.559f)
                curveTo(5.1363f, 14.9671f, 5.4832f, 15.2912f, 6.5427f, 16.2176f)
                lineTo(8.5427f, 17.9663f)
                curveTo(9.4987f, 18.8023f, 10.1635f, 19.3817f, 10.7265f, 19.7605f)
                curveTo(11.2718f, 20.1275f, 11.6425f, 20.25f, 12.0f, 20.25f)
                curveTo(12.3575f, 20.25f, 12.7282f, 20.1275f, 13.2735f, 19.7605f)
                curveTo(13.8365f, 19.3817f, 14.5013f, 18.8023f, 15.4573f, 17.9663f)
                lineTo(17.4574f, 16.2176f)
                curveTo(18.5168f, 15.2912f, 18.8637f, 14.9671f, 19.049f, 14.559f)
                curveTo(19.2343f, 14.1509f, 19.25f, 13.6768f, 19.25f, 12.27f)
                verticalLineTo(2.75f)
                horizontalLineTo(4.75f)
                close()
                moveTo(7.75f, 8.0f)
                curveTo(7.75f, 7.5858f, 8.0858f, 7.25f, 8.5f, 7.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 7.25f, 16.25f, 7.5858f, 16.25f, 8.0f)
                curveTo(16.25f, 8.4142f, 15.9142f, 8.75f, 15.5f, 8.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 8.75f, 7.75f, 8.4142f, 7.75f, 8.0f)
                close()
                moveTo(7.75f, 13.0f)
                curveTo(7.75f, 12.5858f, 8.0858f, 12.25f, 8.5f, 12.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 12.25f, 16.25f, 12.5858f, 16.25f, 13.0f)
                curveTo(16.25f, 13.4142f, 15.9142f, 13.75f, 15.5f, 13.75f)
                horizontalLineTo(8.5f)
                curveTo(8.0858f, 13.75f, 7.75f, 13.4142f, 7.75f, 13.0f)
                close()
            }
        }
            .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
