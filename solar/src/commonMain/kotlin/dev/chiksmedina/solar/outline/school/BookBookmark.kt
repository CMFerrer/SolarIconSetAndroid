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

val SchoolGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(
            name = "BookBookmark", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
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
                horizontalLineTo(13.75f)
                verticalLineTo(19.5309f)
                curveTo(13.75f, 19.5396f, 13.75f, 19.5485f, 13.75f, 19.5578f)
                curveTo(13.7502f, 19.6691f, 13.7504f, 19.8276f, 13.7291f, 19.9638f)
                curveTo(13.7031f, 20.1302f, 13.6176f, 20.4514f, 13.2849f, 20.6468f)
                curveTo(12.9645f, 20.8349f, 12.6512f, 20.765f, 12.5022f, 20.7187f)
                curveTo(12.3724f, 20.6783f, 12.23f, 20.6105f, 12.1238f, 20.56f)
                curveTo(12.1154f, 20.556f, 12.1072f, 20.5521f, 12.0993f, 20.5483f)
                lineTo(11.0f, 20.0261f)
                lineTo(9.9007f, 20.5483f)
                curveTo(9.8928f, 20.5521f, 9.8846f, 20.5559f, 9.8762f, 20.56f)
                curveTo(9.77f, 20.6105f, 9.6276f, 20.6783f, 9.4978f, 20.7187f)
                curveTo(9.3488f, 20.765f, 9.0355f, 20.8349f, 8.7151f, 20.6468f)
                curveTo(8.3825f, 20.4514f, 8.2969f, 20.1302f, 8.2709f, 19.9638f)
                curveTo(8.2496f, 19.8276f, 8.2498f, 19.6691f, 8.25f, 19.5578f)
                curveTo(8.25f, 19.5485f, 8.25f, 19.5396f, 8.25f, 19.5309f)
                verticalLineTo(16.75f)
                horizontalLineTo(7.8978f)
                curveTo(6.9195f, 16.75f, 6.5775f, 16.7564f, 6.3154f, 16.8267f)
                curveTo(5.5961f, 17.0194f, 5.0227f, 17.5541f, 4.7768f, 18.2491f)
                close()
                moveTo(9.75f, 16.75f)
                verticalLineTo(18.9592f)
                lineTo(10.4993f, 18.6033f)
                curveTo(10.5012f, 18.6024f, 10.5041f, 18.6009f, 10.5081f, 18.5989f)
                curveTo(10.5571f, 18.5738f, 10.7637f, 18.4682f, 11.0f, 18.4682f)
                curveTo(11.2363f, 18.4682f, 11.4429f, 18.5738f, 11.4919f, 18.5989f)
                curveTo(11.4959f, 18.6009f, 11.4989f, 18.6024f, 11.5007f, 18.6033f)
                lineTo(12.25f, 18.9592f)
                verticalLineTo(16.75f)
                horizontalLineTo(9.75f)
                close()
                moveTo(7.8978f, 15.25f)
                curveTo(7.8586f, 15.25f, 7.82f, 15.25f, 7.782f, 15.25f)
                curveTo(6.964f, 15.2497f, 6.4059f, 15.2495f, 5.9272f, 15.3778f)
                curveTo(5.4992f, 15.4925f, 5.1022f, 15.6798f, 4.75f, 15.9259f)
                verticalLineTo(8.0f)
                curveTo(4.75f, 6.5646f, 4.7516f, 5.5635f, 4.8531f, 4.8081f)
                curveTo(4.9518f, 4.0743f, 5.1322f, 3.6858f, 5.409f, 3.409f)
                curveTo(5.6858f, 3.1323f, 6.0743f, 2.9518f, 6.8081f, 2.8531f)
                curveTo(7.5635f, 2.7516f, 8.5646f, 2.75f, 10.0f, 2.75f)
                horizontalLineTo(14.0f)
                curveTo(15.4354f, 2.75f, 16.4365f, 2.7516f, 17.1919f, 2.8531f)
                curveTo(17.9257f, 2.9518f, 18.3142f, 3.1323f, 18.591f, 3.409f)
                curveTo(18.8678f, 3.6858f, 19.0482f, 4.0743f, 19.1469f, 4.8081f)
                curveTo(19.2484f, 5.5635f, 19.25f, 6.5646f, 19.25f, 8.0f)
                verticalLineTo(15.25f)
                horizontalLineTo(7.8978f)
                close()
                moveTo(7.25f, 7.0f)
                curveTo(7.25f, 6.5858f, 7.5858f, 6.25f, 8.0f, 6.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 6.25f, 16.75f, 6.5858f, 16.75f, 7.0f)
                curveTo(16.75f, 7.4142f, 16.4142f, 7.75f, 16.0f, 7.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 7.75f, 7.25f, 7.4142f, 7.25f, 7.0f)
                close()
                moveTo(7.25f, 10.5f)
                curveTo(7.25f, 10.0858f, 7.5858f, 9.75f, 8.0f, 9.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 9.75f, 13.75f, 10.0858f, 13.75f, 10.5f)
                curveTo(13.75f, 10.9142f, 13.4142f, 11.25f, 13.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                close()
            }
        }
            .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
