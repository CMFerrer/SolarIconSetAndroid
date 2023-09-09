package com.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.TimeGroup

public val TimeGroup.WatchSquareMinimalistic: ImageVector
    get() {
        if (_watchSquareMinimalistic != null) {
            return _watchSquareMinimalistic!!
        }
        _watchSquareMinimalistic = Builder(name = "WatchSquareMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 2.0f)
                curveTo(6.25f, 1.5858f, 6.5858f, 1.25f, 7.0f, 1.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 1.25f, 17.75f, 1.5858f, 17.75f, 2.0f)
                curveTo(17.75f, 2.4142f, 17.4142f, 2.75f, 17.0f, 2.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 2.75f, 6.25f, 2.4142f, 6.25f, 2.0f)
                close()
                moveTo(11.9584f, 4.25f)
                horizontalLineTo(12.0416f)
                curveTo(13.4108f, 4.25f, 14.4957f, 4.25f, 15.3621f, 4.3381f)
                curveTo(16.2497f, 4.4284f, 16.9907f, 4.6174f, 17.639f, 5.0505f)
                curveTo(18.1576f, 5.3971f, 18.6029f, 5.8424f, 18.9495f, 6.361f)
                curveTo(19.3826f, 7.0093f, 19.5716f, 7.7503f, 19.6619f, 8.6379f)
                curveTo(19.75f, 9.5043f, 19.75f, 10.5892f, 19.75f, 11.9584f)
                verticalLineTo(12.0416f)
                curveTo(19.75f, 13.4108f, 19.75f, 14.4957f, 19.6619f, 15.3621f)
                curveTo(19.5716f, 16.2497f, 19.3826f, 16.9907f, 18.9495f, 17.639f)
                curveTo(18.6029f, 18.1576f, 18.1576f, 18.6029f, 17.639f, 18.9495f)
                curveTo(16.9907f, 19.3826f, 16.2497f, 19.5716f, 15.3621f, 19.6619f)
                curveTo(14.4957f, 19.75f, 13.4108f, 19.75f, 12.0416f, 19.75f)
                horizontalLineTo(11.9584f)
                curveTo(10.5892f, 19.75f, 9.5043f, 19.75f, 8.6379f, 19.6619f)
                curveTo(7.7503f, 19.5716f, 7.0093f, 19.3826f, 6.361f, 18.9495f)
                curveTo(5.8424f, 18.6029f, 5.3971f, 18.1576f, 5.0505f, 17.639f)
                curveTo(4.6174f, 16.9907f, 4.4284f, 16.2497f, 4.3381f, 15.3621f)
                curveTo(4.25f, 14.4957f, 4.25f, 13.4108f, 4.25f, 12.0416f)
                verticalLineTo(11.9584f)
                curveTo(4.25f, 10.5892f, 4.25f, 9.5043f, 4.3381f, 8.6379f)
                curveTo(4.4284f, 7.7503f, 4.6174f, 7.0093f, 5.0505f, 6.361f)
                curveTo(5.3971f, 5.8424f, 5.8424f, 5.3971f, 6.361f, 5.0505f)
                curveTo(7.0093f, 4.6174f, 7.7503f, 4.4284f, 8.6379f, 4.3381f)
                curveTo(9.5043f, 4.25f, 10.5892f, 4.25f, 11.9584f, 4.25f)
                close()
                moveTo(8.7898f, 5.8304f)
                curveTo(8.0207f, 5.9086f, 7.5551f, 6.0567f, 7.1944f, 6.2977f)
                curveTo(6.8395f, 6.5348f, 6.5348f, 6.8395f, 6.2977f, 7.1944f)
                curveTo(6.0567f, 7.5551f, 5.9086f, 8.0207f, 5.8304f, 8.7898f)
                curveTo(5.7509f, 9.5713f, 5.75f, 10.5799f, 5.75f, 12.0f)
                curveTo(5.75f, 13.4201f, 5.7509f, 14.4287f, 5.8304f, 15.2102f)
                curveTo(5.9086f, 15.9793f, 6.0567f, 16.4449f, 6.2977f, 16.8056f)
                curveTo(6.5348f, 17.1605f, 6.8395f, 17.4652f, 7.1944f, 17.7023f)
                curveTo(7.5551f, 17.9433f, 8.0207f, 18.0914f, 8.7898f, 18.1696f)
                curveTo(9.5713f, 18.2491f, 10.5799f, 18.25f, 12.0f, 18.25f)
                curveTo(13.4201f, 18.25f, 14.4287f, 18.2491f, 15.2102f, 18.1696f)
                curveTo(15.9793f, 18.0914f, 16.4449f, 17.9433f, 16.8056f, 17.7023f)
                curveTo(17.1605f, 17.4652f, 17.4652f, 17.1605f, 17.7023f, 16.8056f)
                curveTo(17.9433f, 16.4449f, 18.0914f, 15.9793f, 18.1696f, 15.2102f)
                curveTo(18.2491f, 14.4287f, 18.25f, 13.4201f, 18.25f, 12.0f)
                curveTo(18.25f, 10.5799f, 18.2491f, 9.5713f, 18.1696f, 8.7898f)
                curveTo(18.0914f, 8.0207f, 17.9433f, 7.5551f, 17.7023f, 7.1944f)
                curveTo(17.4652f, 6.8395f, 17.1605f, 6.5348f, 16.8056f, 6.2977f)
                curveTo(16.4449f, 6.0567f, 15.9793f, 5.9086f, 15.2102f, 5.8304f)
                curveTo(14.4287f, 5.7509f, 13.4201f, 5.75f, 12.0f, 5.75f)
                curveTo(10.5799f, 5.75f, 9.5713f, 5.7509f, 8.7898f, 5.8304f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(11.7576f)
                lineTo(14.5198f, 13.4594f)
                curveTo(14.8184f, 13.7465f, 14.8277f, 14.2212f, 14.5406f, 14.5198f)
                curveTo(14.2535f, 14.8184f, 13.7787f, 14.8277f, 13.4802f, 14.5406f)
                lineTo(11.8638f, 12.9864f)
                curveTo(11.5611f, 12.6954f, 11.4098f, 12.5499f, 11.3299f, 12.3622f)
                curveTo(11.25f, 12.1745f, 11.25f, 11.9646f, 11.25f, 11.5447f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(6.25f, 22.0f)
                curveTo(6.25f, 21.5858f, 6.5858f, 21.25f, 7.0f, 21.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 21.25f, 17.75f, 21.5858f, 17.75f, 22.0f)
                curveTo(17.75f, 22.4142f, 17.4142f, 22.75f, 17.0f, 22.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 22.75f, 6.25f, 22.4142f, 6.25f, 22.0f)
                close()
            }
        }
        .build()
        return _watchSquareMinimalistic!!
    }

private var _watchSquareMinimalistic: ImageVector? = null
