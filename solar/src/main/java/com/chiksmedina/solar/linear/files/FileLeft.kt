package com.chiksmedina.solar.linear.files

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
import com.chiksmedina.solar.linear.FilesGroup

val FilesGroup.FileLeft: ImageVector
    get() {
        if (_fileLeft != null) {
            return _fileLeft!!
        }
        _fileLeft = Builder(
            name = "FileLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.3929f, 4.0536f)
                lineTo(14.8912f, 4.6111f)
                lineTo(14.8912f, 4.6111f)
                lineTo(15.3929f, 4.0536f)
                close()
                moveTo(19.3517f, 7.6165f)
                lineTo(18.85f, 8.174f)
                lineTo(18.85f, 8.174f)
                lineTo(19.3517f, 7.6165f)
                close()
                moveTo(21.654f, 10.1541f)
                lineTo(20.9689f, 10.4592f)
                lineTo(20.9689f, 10.4592f)
                lineTo(21.654f, 10.1541f)
                close()
                moveTo(3.1716f, 20.8284f)
                lineTo(3.7019f, 20.2981f)
                lineTo(3.7019f, 20.2981f)
                lineTo(3.1716f, 20.8284f)
                close()
                moveTo(20.8284f, 20.8284f)
                lineTo(20.2981f, 20.2981f)
                lineTo(20.2981f, 20.2981f)
                lineTo(20.8284f, 20.8284f)
                close()
                moveTo(14.0f, 21.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.25f)
                close()
                moveTo(2.75f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.25f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(21.25f, 13.5629f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(13.5629f)
                horizontalLineTo(21.25f)
                close()
                moveTo(14.8912f, 4.6111f)
                lineTo(18.85f, 8.174f)
                lineTo(19.8534f, 7.0591f)
                lineTo(15.8947f, 3.4962f)
                lineTo(14.8912f, 4.6111f)
                close()
                moveTo(22.75f, 13.5629f)
                curveTo(22.75f, 11.8745f, 22.7651f, 10.8055f, 22.3391f, 9.849f)
                lineTo(20.9689f, 10.4592f)
                curveTo(21.2349f, 11.0565f, 21.25f, 11.742f, 21.25f, 13.5629f)
                horizontalLineTo(22.75f)
                close()
                moveTo(18.85f, 8.174f)
                curveTo(20.2034f, 9.3921f, 20.7029f, 9.862f, 20.9689f, 10.4592f)
                lineTo(22.3391f, 9.849f)
                curveTo(21.9131f, 8.8924f, 21.1084f, 8.1885f, 19.8534f, 7.0591f)
                lineTo(18.85f, 8.174f)
                close()
                moveTo(10.0298f, 2.75f)
                curveTo(11.6116f, 2.75f, 12.2085f, 2.7616f, 12.7405f, 2.9657f)
                lineTo(13.2779f, 1.5653f)
                curveTo(12.4261f, 1.2384f, 11.498f, 1.25f, 10.0298f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(15.8947f, 3.4962f)
                curveTo(14.8087f, 2.5188f, 14.1297f, 1.8921f, 13.2779f, 1.5653f)
                lineTo(12.7405f, 2.9657f)
                curveTo(13.2727f, 3.1699f, 13.7215f, 3.5584f, 14.8912f, 4.6111f)
                lineTo(15.8947f, 3.4962f)
                close()
                moveTo(10.0f, 21.25f)
                curveTo(8.0932f, 21.25f, 6.7385f, 21.2484f, 5.7108f, 21.1102f)
                curveTo(4.7048f, 20.975f, 4.1251f, 20.7213f, 3.7019f, 20.2981f)
                lineTo(2.6412f, 21.3588f)
                curveTo(3.3896f, 22.1071f, 4.3386f, 22.4392f, 5.511f, 22.5969f)
                curveTo(6.6618f, 22.7516f, 8.1356f, 22.75f, 10.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(1.25f, 14.0f)
                curveTo(1.25f, 15.8644f, 1.2484f, 17.3382f, 1.4031f, 18.489f)
                curveTo(1.5608f, 19.6614f, 1.8929f, 20.6104f, 2.6412f, 21.3588f)
                lineTo(3.7019f, 20.2981f)
                curveTo(3.2787f, 19.8749f, 3.025f, 19.2952f, 2.8898f, 18.2892f)
                curveTo(2.7516f, 17.2615f, 2.75f, 15.9068f, 2.75f, 14.0f)
                horizontalLineTo(1.25f)
                close()
                moveTo(14.0f, 22.75f)
                curveTo(15.8644f, 22.75f, 17.3382f, 22.7516f, 18.489f, 22.5969f)
                curveTo(19.6614f, 22.4392f, 20.6104f, 22.1071f, 21.3588f, 21.3588f)
                lineTo(20.2981f, 20.2981f)
                curveTo(19.8749f, 20.7213f, 19.2952f, 20.975f, 18.2892f, 21.1102f)
                curveTo(17.2615f, 21.2484f, 15.9068f, 21.25f, 14.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(21.25f, 14.0f)
                curveTo(21.25f, 15.9068f, 21.2484f, 17.2615f, 21.1102f, 18.2892f)
                curveTo(20.975f, 19.2952f, 20.7213f, 19.8749f, 20.2981f, 20.2981f)
                lineTo(21.3588f, 21.3588f)
                curveTo(22.1071f, 20.6104f, 22.4392f, 19.6614f, 22.5969f, 18.489f)
                curveTo(22.7516f, 17.3382f, 22.75f, 15.8644f, 22.75f, 14.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(2.75f, 10.0f)
                curveTo(2.75f, 8.0932f, 2.7516f, 6.7385f, 2.8898f, 5.7108f)
                curveTo(3.025f, 4.7048f, 3.2787f, 4.1251f, 3.7019f, 3.7019f)
                lineTo(2.6412f, 2.6412f)
                curveTo(1.8929f, 3.3896f, 1.5608f, 4.3386f, 1.4031f, 5.511f)
                curveTo(1.2484f, 6.6618f, 1.25f, 8.1356f, 1.25f, 10.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(10.0298f, 1.25f)
                curveTo(8.1554f, 1.25f, 6.6744f, 1.2484f, 5.5189f, 1.4031f)
                curveTo(4.3423f, 1.5605f, 3.3902f, 1.8923f, 2.6412f, 2.6412f)
                lineTo(3.7019f, 3.7019f)
                curveTo(4.1245f, 3.2793f, 4.706f, 3.0252f, 5.7179f, 2.8898f)
                curveTo(6.7508f, 2.7516f, 8.1131f, 2.75f, 10.0298f, 2.75f)
                verticalLineTo(1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 2.5f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 7.357f, 13.0f, 8.5355f, 13.7322f, 9.2678f)
                curveTo(14.4645f, 10.0f, 15.643f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                moveTo(6.0f, 16.0f)
                lineTo(7.875f, 14.0f)
                moveTo(6.0f, 16.0f)
                lineTo(7.875f, 18.0f)
            }
        }
            .build()
        return _fileLeft!!
    }

private var _fileLeft: ImageVector? = null
