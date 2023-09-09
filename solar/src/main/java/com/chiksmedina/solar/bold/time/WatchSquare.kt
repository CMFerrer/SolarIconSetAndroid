package com.chiksmedina.solar.bold.time

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
import com.chiksmedina.solar.bold.TimeGroup

public val TimeGroup.WatchSquare: ImageVector
    get() {
        if (_watchSquare != null) {
            return _watchSquare!!
        }
        _watchSquare = Builder(name = "WatchSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 9.1911f, 5.0f, 7.7866f, 5.6741f, 6.7777f)
                curveTo(5.966f, 6.341f, 6.341f, 5.966f, 6.7777f, 5.6741f)
                curveTo(7.7866f, 5.0f, 9.1911f, 5.0f, 12.0f, 5.0f)
                curveTo(14.8089f, 5.0f, 16.2134f, 5.0f, 17.2223f, 5.6741f)
                curveTo(17.659f, 5.966f, 18.034f, 6.341f, 18.3259f, 6.7777f)
                curveTo(19.0f, 7.7866f, 19.0f, 9.1911f, 19.0f, 12.0f)
                curveTo(19.0f, 14.8089f, 19.0f, 16.2134f, 18.3259f, 17.2223f)
                curveTo(18.034f, 17.659f, 17.659f, 18.034f, 17.2223f, 18.3259f)
                curveTo(16.2134f, 19.0f, 14.8089f, 19.0f, 12.0f, 19.0f)
                curveTo(9.1911f, 19.0f, 7.7866f, 19.0f, 6.7777f, 18.3259f)
                curveTo(6.341f, 18.034f, 5.966f, 17.659f, 5.6741f, 17.2223f)
                curveTo(5.0f, 16.2134f, 5.0f, 14.8089f, 5.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 22.0f)
                horizontalLineTo(11.5f)
                curveTo(10.0955f, 22.0f, 9.3933f, 22.0f, 8.8889f, 21.6629f)
                curveTo(8.6705f, 21.517f, 8.483f, 21.3295f, 8.3371f, 21.1111f)
                curveTo(8.1973f, 20.9019f, 8.1154f, 20.6587f, 8.0676f, 20.3454f)
                curveTo(8.2302f, 20.3705f, 8.3951f, 20.391f, 8.562f, 20.408f)
                curveTo(9.4667f, 20.5001f, 10.5842f, 20.5f, 11.9233f, 20.5f)
                horizontalLineTo(12.0767f)
                curveTo(13.4158f, 20.5f, 14.5333f, 20.5001f, 15.438f, 20.408f)
                curveTo(15.6049f, 20.391f, 15.7698f, 20.3705f, 15.9324f, 20.3454f)
                curveTo(15.8846f, 20.6587f, 15.8027f, 20.9019f, 15.6629f, 21.1111f)
                curveTo(15.517f, 21.3295f, 15.3295f, 21.517f, 15.1111f, 21.6629f)
                curveTo(14.6067f, 22.0f, 13.9045f, 22.0f, 12.5f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                horizontalLineTo(11.5f)
                curveTo(10.0955f, 2.0f, 9.3933f, 2.0f, 8.8889f, 2.3371f)
                curveTo(8.6705f, 2.483f, 8.483f, 2.6705f, 8.3371f, 2.8889f)
                curveTo(8.1973f, 3.0981f, 8.1154f, 3.3413f, 8.0676f, 3.6546f)
                curveTo(8.2302f, 3.6295f, 8.3951f, 3.6089f, 8.562f, 3.592f)
                curveTo(9.4667f, 3.4999f, 10.5842f, 3.5f, 11.9233f, 3.5f)
                horizontalLineTo(12.0767f)
                curveTo(13.4158f, 3.5f, 14.5333f, 3.4999f, 15.438f, 3.592f)
                curveTo(15.6049f, 3.6089f, 15.7698f, 3.6295f, 15.9324f, 3.6546f)
                curveTo(15.8846f, 3.3413f, 15.8027f, 3.0981f, 15.6629f, 2.8889f)
                curveTo(15.517f, 2.6705f, 15.3295f, 2.483f, 15.1111f, 2.3371f)
                curveTo(14.6067f, 2.0f, 13.9045f, 2.0f, 12.5f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.7576f)
                lineTo(14.5198f, 13.4594f)
                curveTo(14.8184f, 13.7465f, 14.8277f, 14.2212f, 14.5406f, 14.5198f)
                curveTo(14.2535f, 14.8184f, 13.7787f, 14.8277f, 13.4802f, 14.5406f)
                lineTo(11.4802f, 12.6175f)
                curveTo(11.3331f, 12.4761f, 11.25f, 12.2809f, 11.25f, 12.0769f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
        }
        .build()
        return _watchSquare!!
    }

private var _watchSquare: ImageVector? = null
