package dev.chiksmedina.solar.bold.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.CallGroup

val CallGroup.CallDropped: ImageVector
    get() {
        if (_callDropped != null) {
            return _callDropped!!
        }
        _callDropped = Builder(
            name = "CallDropped", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0001f, 4.0001f)
                verticalLineTo(5.0001f)
                curveTo(15.0001f, 6.8857f, 15.0001f, 7.8285f, 15.5859f, 8.4143f)
                curveTo(16.1717f, 9.0001f, 17.1145f, 9.0001f, 19.0001f, 9.0001f)
                horizontalLineTo(20.5001f)
                moveTo(20.5001f, 9.0001f)
                lineTo(18.0001f, 7.0001f)
                moveTo(20.5001f, 9.0001f)
                lineTo(18.0001f, 11.0001f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5562f, 14.5477f)
                lineTo(15.1007f, 15.0272f)
                curveTo(15.1007f, 15.0272f, 14.0181f, 16.167f, 11.0631f, 13.0559f)
                curveTo(8.1081f, 9.9448f, 9.1907f, 8.8051f, 9.1907f, 8.8051f)
                lineTo(9.4775f, 8.5031f)
                curveTo(10.1841f, 7.7592f, 10.2507f, 6.565f, 9.6342f, 5.6931f)
                lineTo(8.3733f, 3.9096f)
                curveTo(7.6103f, 2.8305f, 6.136f, 2.6879f, 5.2614f, 3.6086f)
                lineTo(3.6918f, 5.2611f)
                curveTo(3.2582f, 5.7177f, 2.9676f, 6.3095f, 3.0029f, 6.9659f)
                curveTo(3.093f, 8.6455f, 3.8107f, 12.259f, 7.8154f, 16.4752f)
                curveTo(12.0621f, 20.9462f, 16.0468f, 21.1239f, 17.6763f, 20.9631f)
                curveTo(18.1917f, 20.9122f, 18.6399f, 20.6343f, 19.0011f, 20.254f)
                lineTo(20.4217f, 18.7584f)
                curveTo(21.3806f, 17.7489f, 21.1102f, 16.0182f, 19.8833f, 15.312f)
                lineTo(17.9728f, 14.2123f)
                curveTo(17.1672f, 13.7486f, 16.1858f, 13.8848f, 15.5562f, 14.5477f)
                close()
            }
        }
            .build()
        return _callDropped!!
    }

private var _callDropped: ImageVector? = null
