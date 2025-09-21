package dev.chiksmedina.solar.outline.homefurniture

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
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

val HomeFurnitureGroup.RemoteController2: ImageVector
    get() {
        if (_remoteController2 != null) {
            return _remoteController2!!
        }
        _remoteController2 = Builder(
            name = "RemoteController2", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9584f, 1.25f)
                horizontalLineTo(12.0416f)
                curveTo(13.4108f, 1.25f, 14.4957f, 1.25f, 15.3621f, 1.3381f)
                curveTo(16.2497f, 1.4284f, 16.9907f, 1.6174f, 17.639f, 2.0505f)
                curveTo(18.1576f, 2.3971f, 18.6029f, 2.8424f, 18.9495f, 3.361f)
                curveTo(19.3826f, 4.0093f, 19.5716f, 4.7503f, 19.6619f, 5.6379f)
                curveTo(19.75f, 6.5043f, 19.75f, 7.5892f, 19.75f, 8.9584f)
                verticalLineTo(15.0416f)
                curveTo(19.75f, 16.4108f, 19.75f, 17.4957f, 19.6619f, 18.3621f)
                curveTo(19.5716f, 19.2497f, 19.3826f, 19.9907f, 18.9495f, 20.639f)
                curveTo(18.6029f, 21.1576f, 18.1576f, 21.6029f, 17.639f, 21.9495f)
                curveTo(16.9907f, 22.3826f, 16.2497f, 22.5716f, 15.3621f, 22.6619f)
                curveTo(14.4957f, 22.75f, 13.4108f, 22.75f, 12.0416f, 22.75f)
                horizontalLineTo(11.9584f)
                curveTo(10.5892f, 22.75f, 9.5043f, 22.75f, 8.6379f, 22.6619f)
                curveTo(7.7503f, 22.5716f, 7.0093f, 22.3826f, 6.361f, 21.9495f)
                curveTo(5.8424f, 21.6029f, 5.3971f, 21.1576f, 5.0505f, 20.639f)
                curveTo(4.6174f, 19.9907f, 4.4284f, 19.2497f, 4.3381f, 18.3621f)
                curveTo(4.25f, 17.4957f, 4.25f, 16.4108f, 4.25f, 15.0416f)
                verticalLineTo(8.9584f)
                curveTo(4.25f, 7.5892f, 4.25f, 6.5043f, 4.3381f, 5.6379f)
                curveTo(4.4284f, 4.7503f, 4.6174f, 4.0093f, 5.0505f, 3.361f)
                curveTo(5.3971f, 2.8424f, 5.8424f, 2.3971f, 6.361f, 2.0505f)
                curveTo(7.0093f, 1.6174f, 7.7503f, 1.4284f, 8.6379f, 1.3381f)
                curveTo(9.5043f, 1.25f, 10.5892f, 1.25f, 11.9584f, 1.25f)
                close()
                moveTo(8.7898f, 2.8304f)
                curveTo(8.0207f, 2.9086f, 7.5551f, 3.0567f, 7.1944f, 3.2977f)
                curveTo(6.8395f, 3.5348f, 6.5348f, 3.8395f, 6.2977f, 4.1944f)
                curveTo(6.0567f, 4.5551f, 5.9086f, 5.0207f, 5.8304f, 5.7898f)
                curveTo(5.7509f, 6.5713f, 5.75f, 7.5799f, 5.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(5.75f, 16.4201f, 5.7509f, 17.4287f, 5.8304f, 18.2102f)
                curveTo(5.9086f, 18.9793f, 6.0567f, 19.4449f, 6.2977f, 19.8056f)
                curveTo(6.5348f, 20.1605f, 6.8395f, 20.4652f, 7.1944f, 20.7023f)
                curveTo(7.5551f, 20.9433f, 8.0207f, 21.0914f, 8.7898f, 21.1696f)
                curveTo(9.5713f, 21.2491f, 10.5799f, 21.25f, 12.0f, 21.25f)
                curveTo(13.4201f, 21.25f, 14.4287f, 21.2491f, 15.2102f, 21.1696f)
                curveTo(15.9793f, 21.0914f, 16.4449f, 20.9433f, 16.8056f, 20.7023f)
                curveTo(17.1605f, 20.4652f, 17.4652f, 20.1605f, 17.7023f, 19.8056f)
                curveTo(17.9433f, 19.4449f, 18.0914f, 18.9793f, 18.1696f, 18.2102f)
                curveTo(18.2491f, 17.4287f, 18.25f, 16.4201f, 18.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.25f, 7.5799f, 18.2491f, 6.5713f, 18.1696f, 5.7898f)
                curveTo(18.0914f, 5.0207f, 17.9433f, 4.5551f, 17.7023f, 4.1944f)
                curveTo(17.4652f, 3.8395f, 17.1605f, 3.5348f, 16.8056f, 3.2977f)
                curveTo(16.4449f, 3.0567f, 15.9793f, 2.9086f, 15.2102f, 2.8304f)
                curveTo(14.4287f, 2.7509f, 13.4201f, 2.75f, 12.0f, 2.75f)
                curveTo(10.5799f, 2.75f, 9.5713f, 2.7509f, 8.7898f, 2.8304f)
                close()
                moveTo(12.0f, 13.25f)
                curveTo(10.7574f, 13.25f, 9.75f, 14.2574f, 9.75f, 15.5f)
                curveTo(9.75f, 16.7426f, 10.7574f, 17.75f, 12.0f, 17.75f)
                curveTo(13.2426f, 17.75f, 14.25f, 16.7426f, 14.25f, 15.5f)
                curveTo(14.25f, 14.2574f, 13.2426f, 13.25f, 12.0f, 13.25f)
                close()
                moveTo(8.25f, 15.5f)
                curveTo(8.25f, 13.4289f, 9.9289f, 11.75f, 12.0f, 11.75f)
                curveTo(14.0711f, 11.75f, 15.75f, 13.4289f, 15.75f, 15.5f)
                curveTo(15.75f, 17.5711f, 14.0711f, 19.25f, 12.0f, 19.25f)
                curveTo(9.9289f, 19.25f, 8.25f, 17.5711f, 8.25f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 9.5f)
                curveTo(11.0f, 10.0523f, 10.5523f, 10.5f, 10.0f, 10.5f)
                curveTo(9.4477f, 10.5f, 9.0f, 10.0523f, 9.0f, 9.5f)
                curveTo(9.0f, 8.9477f, 9.4477f, 8.5f, 10.0f, 8.5f)
                curveTo(10.5523f, 8.5f, 11.0f, 8.9477f, 11.0f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 6.0f)
                curveTo(11.0f, 6.5523f, 10.5523f, 7.0f, 10.0f, 7.0f)
                curveTo(9.4477f, 7.0f, 9.0f, 6.5523f, 9.0f, 6.0f)
                curveTo(9.0f, 5.4477f, 9.4477f, 5.0f, 10.0f, 5.0f)
                curveTo(10.5523f, 5.0f, 11.0f, 5.4477f, 11.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 9.5f)
                curveTo(15.0f, 10.0523f, 14.5523f, 10.5f, 14.0f, 10.5f)
                curveTo(13.4477f, 10.5f, 13.0f, 10.0523f, 13.0f, 9.5f)
                curveTo(13.0f, 8.9477f, 13.4477f, 8.5f, 14.0f, 8.5f)
                curveTo(14.5523f, 8.5f, 15.0f, 8.9477f, 15.0f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 6.0f)
                curveTo(15.0f, 6.5523f, 14.5523f, 7.0f, 14.0f, 7.0f)
                curveTo(13.4477f, 7.0f, 13.0f, 6.5523f, 13.0f, 6.0f)
                curveTo(13.0f, 5.4477f, 13.4477f, 5.0f, 14.0f, 5.0f)
                curveTo(14.5523f, 5.0f, 15.0f, 5.4477f, 15.0f, 6.0f)
                close()
            }
        }
            .build()
        return _remoteController2!!
    }

private var _remoteController2: ImageVector? = null
