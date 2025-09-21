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

val MoneyGroup.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(
            name = "Euro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 11.7454f, 6.7681f, 11.495f, 6.8032f, 11.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 11.25f, 10.75f, 10.9142f, 10.75f, 10.5f)
                curveTo(10.75f, 10.0858f, 10.4142f, 9.75f, 10.0f, 9.75f)
                horizontalLineTo(7.2552f)
                curveTo(8.0978f, 7.9763f, 9.9057f, 6.75f, 12.0f, 6.75f)
                curveTo(12.9575f, 6.75f, 13.853f, 7.0056f, 14.6245f, 7.4519f)
                curveTo(14.983f, 7.6593f, 15.4418f, 7.5368f, 15.6492f, 7.1782f)
                curveTo(15.8566f, 6.8197f, 15.7341f, 6.3609f, 15.3755f, 6.1535f)
                curveTo(14.3819f, 5.5787f, 13.2282f, 5.25f, 12.0f, 5.25f)
                curveTo(9.061f, 5.25f, 6.5607f, 7.1283f, 5.6341f, 9.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 9.75f, 4.25f, 10.0858f, 4.25f, 10.5f)
                curveTo(4.25f, 10.9142f, 4.5858f, 11.25f, 5.0f, 11.25f)
                horizontalLineTo(5.2912f)
                curveTo(5.264f, 11.4963f, 5.25f, 11.7465f, 5.25f, 12.0f)
                curveTo(5.25f, 12.2535f, 5.264f, 12.5037f, 5.2912f, 12.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 12.75f, 4.25f, 13.0858f, 4.25f, 13.5f)
                curveTo(4.25f, 13.9142f, 4.5858f, 14.25f, 5.0f, 14.25f)
                horizontalLineTo(5.6341f)
                curveTo(6.5607f, 16.8717f, 9.061f, 18.75f, 12.0f, 18.75f)
                curveTo(13.2282f, 18.75f, 14.3819f, 18.4213f, 15.3755f, 17.8465f)
                curveTo(15.7341f, 17.6391f, 15.8566f, 17.1803f, 15.6492f, 16.8218f)
                curveTo(15.4418f, 16.4632f, 14.983f, 16.3407f, 14.6245f, 16.5481f)
                curveTo(13.853f, 16.9944f, 12.9575f, 17.25f, 12.0f, 17.25f)
                curveTo(9.9057f, 17.25f, 8.0978f, 16.0237f, 7.2552f, 14.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 14.25f, 10.75f, 13.9142f, 10.75f, 13.5f)
                curveTo(10.75f, 13.0858f, 10.4142f, 12.75f, 10.0f, 12.75f)
                horizontalLineTo(6.8032f)
                curveTo(6.7681f, 12.505f, 6.75f, 12.2546f, 6.75f, 12.0f)
                close()
            }
        }
            .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
