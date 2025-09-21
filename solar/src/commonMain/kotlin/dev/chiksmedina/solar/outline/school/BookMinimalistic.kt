package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.BookMinimalistic: ImageVector
    get() {
        if (_bookMinimalistic != null) {
            return _bookMinimalistic!!
        }
        _bookMinimalistic = Builder(
            name = "BookMinimalistic", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9451f, 1.25f)
                horizontalLineTo(14.0549f)
                curveTo(15.4225f, 1.25f, 16.5248f, 1.25f, 17.3918f, 1.3665f)
                curveTo(18.2919f, 1.4875f, 19.0497f, 1.7464f, 19.6517f, 2.3484f)
                curveTo(20.2536f, 2.9503f, 20.5125f, 3.7081f, 20.6335f, 4.6083f)
                curveTo(20.75f, 5.4752f, 20.75f, 6.5775f, 20.75f, 7.9451f)
                verticalLineTo(16.0549f)
                curveTo(20.75f, 17.4225f, 20.75f, 18.5248f, 20.6335f, 19.3918f)
                curveTo(20.5125f, 20.2919f, 20.2536f, 21.0497f, 19.6517f, 21.6517f)
                curveTo(19.0497f, 22.2536f, 18.2919f, 22.5125f, 17.3918f, 22.6335f)
                curveTo(16.5248f, 22.75f, 15.4225f, 22.75f, 14.0549f, 22.75f)
                horizontalLineTo(9.9451f)
                curveTo(8.5775f, 22.75f, 7.4752f, 22.75f, 6.6083f, 22.6335f)
                curveTo(5.7081f, 22.5125f, 4.9503f, 22.2536f, 4.3484f, 21.6517f)
                curveTo(3.7464f, 21.0497f, 3.4875f, 20.2919f, 3.3665f, 19.3918f)
                curveTo(3.3278f, 19.1039f, 3.302f, 18.7902f, 3.2847f, 18.4494f)
                curveTo(3.2456f, 18.326f, 3.238f, 18.1912f, 3.2688f, 18.0568f)
                curveTo(3.25f, 17.4649f, 3.25f, 16.7991f, 3.25f, 16.0549f)
                verticalLineTo(7.9451f)
                curveTo(3.25f, 6.5775f, 3.25f, 5.4752f, 3.3665f, 4.6083f)
                curveTo(3.4875f, 3.7081f, 3.7464f, 2.9503f, 4.3484f, 2.3484f)
                curveTo(4.9503f, 1.7464f, 5.7081f, 1.4875f, 6.6083f, 1.3665f)
                curveTo(7.4752f, 1.25f, 8.5775f, 1.25f, 9.9451f, 1.25f)
                close()
                moveTo(4.7768f, 18.2491f)
                curveTo(4.792f, 18.6029f, 4.8158f, 18.914f, 4.8531f, 19.1919f)
                curveTo(4.9518f, 19.9257f, 5.1322f, 20.3142f, 5.409f, 20.591f)
                curveTo(5.6858f, 20.8678f, 6.0743f, 21.0482f, 6.8081f, 21.1469f)
                curveTo(7.5635f, 21.2484f, 8.5646f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.4354f, 21.25f, 16.4365f, 21.2484f, 17.1919f, 21.1469f)
                curveTo(17.9257f, 21.0482f, 18.3142f, 20.8678f, 18.591f, 20.591f)
                curveTo(18.8678f, 20.3142f, 19.0482f, 19.9257f, 19.1469f, 19.1919f)
                curveTo(19.2297f, 18.5756f, 19.246f, 17.7958f, 19.2492f, 16.75f)
                horizontalLineTo(7.8978f)
                curveTo(6.9195f, 16.75f, 6.5775f, 16.7564f, 6.3154f, 16.8267f)
                curveTo(5.5961f, 17.0194f, 5.0227f, 17.5541f, 4.7768f, 18.2491f)
                close()
                moveTo(19.25f, 15.25f)
                verticalLineTo(8.0f)
                curveTo(19.25f, 6.5646f, 19.2484f, 5.5635f, 19.1469f, 4.8081f)
                curveTo(19.0482f, 4.0743f, 18.8678f, 3.6858f, 18.591f, 3.409f)
                curveTo(18.3142f, 3.1323f, 17.9257f, 2.9518f, 17.1919f, 2.8531f)
                curveTo(16.4365f, 2.7516f, 15.4354f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(10.0f)
                curveTo(9.0922f, 2.75f, 8.3581f, 2.7506f, 7.75f, 2.7768f)
                verticalLineTo(15.25f)
                curveTo(7.7606f, 15.25f, 7.7713f, 15.25f, 7.782f, 15.25f)
                curveTo(7.82f, 15.25f, 7.8586f, 15.25f, 7.8978f, 15.25f)
                horizontalLineTo(19.25f)
                close()
                moveTo(6.25f, 15.3114f)
                curveTo(6.1375f, 15.3284f, 6.0305f, 15.3501f, 5.9272f, 15.3778f)
                curveTo(5.4992f, 15.4925f, 5.1022f, 15.6798f, 4.75f, 15.9259f)
                verticalLineTo(8.0f)
                curveTo(4.75f, 6.5646f, 4.7516f, 5.5635f, 4.8531f, 4.8081f)
                curveTo(4.9518f, 4.0743f, 5.1322f, 3.6858f, 5.409f, 3.409f)
                curveTo(5.6053f, 3.2127f, 5.8579f, 3.0649f, 6.25f, 2.9603f)
                verticalLineTo(15.3114f)
                close()
            }
        }
            .build()
        return _bookMinimalistic!!
    }

private var _bookMinimalistic: ImageVector? = null
