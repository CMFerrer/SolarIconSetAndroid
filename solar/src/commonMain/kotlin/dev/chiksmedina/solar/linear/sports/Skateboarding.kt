package dev.chiksmedina.solar.linear.sports

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
import dev.chiksmedina.solar.linear.SportsGroup

val SportsGroup.Skateboarding: ImageVector
    get() {
        if (_skateboarding != null) {
            return _skateboarding!!
        }
        _skateboarding = Builder(
            name = "Skateboarding", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 17.0f)
                lineTo(4.2041f, 18.3379f)
                curveTo(4.5834f, 18.7594f, 5.1238f, 19.0f, 5.6907f, 19.0f)
                horizontalLineTo(18.3093f)
                curveTo(18.8762f, 19.0f, 19.4166f, 18.7594f, 19.7959f, 18.3379f)
                lineTo(21.0f, 17.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 21.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 21.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 16.4999f)
                verticalLineTo(15.2491f)
                curveTo(15.0f, 15.1652f, 15.0f, 15.1233f, 14.999f, 15.0838f)
                curveTo(14.9732f, 14.1057f, 14.4721f, 13.2016f, 13.6563f, 12.6614f)
                curveTo(13.6234f, 12.6396f, 13.5842f, 12.6151f, 13.5057f, 12.566f)
                curveTo(13.4089f, 12.5055f, 13.3604f, 12.4752f, 13.3291f, 12.454f)
                curveTo(12.241f, 11.7153f, 12.1498f, 10.1456f, 13.145f, 9.2858f)
                curveTo(13.1735f, 9.2611f, 13.2125f, 9.23f, 13.2903f, 9.1677f)
                lineTo(13.7358f, 8.8113f)
                curveTo(14.7607f, 7.9914f, 14.5413f, 6.3748f, 13.3349f, 5.8578f)
                curveTo(12.8119f, 5.6336f, 12.2123f, 5.6798f, 11.7297f, 5.9814f)
                lineTo(8.5f, 7.9999f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 15.5f)
                horizontalLineTo(7.3787f)
                curveTo(8.7369f, 15.5f, 10.0396f, 14.9604f, 11.0f, 14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 10.0f)
                curveTo(17.8131f, 10.3283f, 19.1869f, 10.3283f, 20.5f, 10.0f)
            }
        }
            .build()
        return _skateboarding!!
    }

private var _skateboarding: ImageVector? = null
