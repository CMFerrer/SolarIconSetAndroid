package dev.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.Bill: ImageVector
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
                moveTo(19.875f, 20.5917f)
                curveTo(19.2334f, 20.0473f, 18.2666f, 20.0473f, 17.625f, 20.5917f)
                curveTo(16.9834f, 21.1361f, 16.0166f, 21.1361f, 15.375f, 20.5917f)
                curveTo(14.7334f, 20.0473f, 13.7666f, 20.0473f, 13.125f, 20.5917f)
                curveTo(12.4834f, 21.1361f, 11.5166f, 21.1361f, 10.875f, 20.5917f)
                curveTo(10.2334f, 20.0473f, 9.2666f, 20.0473f, 8.625f, 20.5917f)
                curveTo(7.9834f, 21.1361f, 7.0166f, 21.1361f, 6.375f, 20.5917f)
                curveTo(5.7334f, 20.0473f, 4.7666f, 20.0473f, 4.125f, 20.5917f)
                curveTo(3.6891f, 20.9616f, 3.0f, 20.6662f, 3.0f, 20.1094f)
                verticalLineTo(3.8906f)
                curveTo(3.0f, 3.3338f, 3.6891f, 3.0384f, 4.125f, 3.4083f)
                curveTo(4.7666f, 3.9527f, 5.7334f, 3.9527f, 6.375f, 3.4083f)
                curveTo(7.0166f, 2.8639f, 7.9834f, 2.8639f, 8.625f, 3.4083f)
                curveTo(9.2666f, 3.9527f, 10.2334f, 3.9527f, 10.875f, 3.4083f)
                curveTo(11.5166f, 2.8639f, 12.4834f, 2.8639f, 13.125f, 3.4083f)
                curveTo(13.7666f, 3.9527f, 14.7334f, 3.9527f, 15.375f, 3.4083f)
                curveTo(16.0166f, 2.8639f, 16.9834f, 2.8639f, 17.625f, 3.4083f)
                curveTo(18.2666f, 3.9527f, 19.2334f, 3.9527f, 19.875f, 3.4083f)
                curveTo(20.3109f, 3.0384f, 21.0f, 3.3338f, 21.0f, 3.8906f)
                verticalLineTo(20.1094f)
                curveTo(21.0f, 20.6662f, 20.3109f, 20.9616f, 19.875f, 20.5917f)
                close()
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 11.5858f, 7.0858f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 11.25f, 17.25f, 11.5858f, 17.25f, 12.0f)
                curveTo(17.25f, 12.4142f, 16.9142f, 12.75f, 16.5f, 12.75f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 12.75f, 6.75f, 12.4142f, 6.75f, 12.0f)
                close()
                moveTo(7.5f, 7.75f)
                curveTo(7.0858f, 7.75f, 6.75f, 8.0858f, 6.75f, 8.5f)
                curveTo(6.75f, 8.9142f, 7.0858f, 9.25f, 7.5f, 9.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 9.25f, 17.25f, 8.9142f, 17.25f, 8.5f)
                curveTo(17.25f, 8.0858f, 16.9142f, 7.75f, 16.5f, 7.75f)
                horizontalLineTo(7.5f)
                close()
                moveTo(6.75f, 15.5f)
                curveTo(6.75f, 15.0858f, 7.0858f, 14.75f, 7.5f, 14.75f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 14.75f, 17.25f, 15.0858f, 17.25f, 15.5f)
                curveTo(17.25f, 15.9142f, 16.9142f, 16.25f, 16.5f, 16.25f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 16.25f, 6.75f, 15.9142f, 6.75f, 15.5f)
                close()
            }
        }
            .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
