package dev.chiksmedina.solar.outline.users

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
import dev.chiksmedina.solar.outline.UsersGroup

val UsersGroup.UserId: ImageVector
    get() {
        if (_userId != null) {
            return _userId!!
        }
        _userId = Builder(
            name = "UserId", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 6.25f)
                curveTo(7.4812f, 6.25f, 6.25f, 7.4812f, 6.25f, 9.0f)
                curveTo(6.25f, 10.5188f, 7.4812f, 11.75f, 9.0f, 11.75f)
                curveTo(10.5188f, 11.75f, 11.75f, 10.5188f, 11.75f, 9.0f)
                curveTo(11.75f, 7.4812f, 10.5188f, 6.25f, 9.0f, 6.25f)
                close()
                moveTo(7.75f, 9.0f)
                curveTo(7.75f, 8.3097f, 8.3097f, 7.75f, 9.0f, 7.75f)
                curveTo(9.6904f, 7.75f, 10.25f, 8.3097f, 10.25f, 9.0f)
                curveTo(10.25f, 9.6904f, 9.6904f, 10.25f, 9.0f, 10.25f)
                curveTo(8.3097f, 10.25f, 7.75f, 9.6904f, 7.75f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 12.25f)
                curveTo(7.8042f, 12.25f, 6.6846f, 12.4907f, 5.8362f, 12.915f)
                curveTo(5.0326f, 13.3168f, 4.25f, 14.0106f, 4.25f, 15.0f)
                lineTo(4.2499f, 15.0625f)
                curveTo(4.2483f, 15.5728f, 4.2458f, 16.4322f, 5.0602f, 17.0218f)
                curveTo(5.4382f, 17.2953f, 5.9369f, 17.4698f, 6.5547f, 17.581f)
                curveTo(7.1782f, 17.6932f, 7.9772f, 17.75f, 9.0f, 17.75f)
                curveTo(10.0228f, 17.75f, 10.8218f, 17.6932f, 11.4453f, 17.581f)
                curveTo(12.0631f, 17.4698f, 12.5618f, 17.2953f, 12.9398f, 17.0218f)
                curveTo(13.7542f, 16.4322f, 13.7517f, 15.5728f, 13.7501f, 15.0625f)
                lineTo(13.75f, 15.0f)
                curveTo(13.75f, 14.0106f, 12.9674f, 13.3168f, 12.1638f, 12.915f)
                curveTo(11.3154f, 12.4907f, 10.1958f, 12.25f, 9.0f, 12.25f)
                close()
                moveTo(5.75f, 15.0f)
                curveTo(5.75f, 14.8848f, 5.8629f, 14.5787f, 6.507f, 14.2566f)
                curveTo(7.1062f, 13.957f, 7.9866f, 13.75f, 9.0f, 13.75f)
                curveTo(10.0134f, 13.75f, 10.8937f, 13.957f, 11.493f, 14.2566f)
                curveTo(12.1371f, 14.5787f, 12.25f, 14.8848f, 12.25f, 15.0f)
                curveTo(12.25f, 15.6045f, 12.2115f, 15.6972f, 12.0602f, 15.8067f)
                curveTo(11.9382f, 15.895f, 11.6869f, 16.0134f, 11.1797f, 16.1047f)
                curveTo(10.6782f, 16.1949f, 9.9772f, 16.25f, 9.0f, 16.25f)
                curveTo(8.0228f, 16.25f, 7.3218f, 16.1949f, 6.8203f, 16.1047f)
                curveTo(6.3131f, 16.0134f, 6.0618f, 15.895f, 5.9398f, 15.8067f)
                curveTo(5.7885f, 15.6972f, 5.75f, 15.6045f, 5.75f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 12.75f)
                curveTo(19.4142f, 12.75f, 19.75f, 12.4142f, 19.75f, 12.0f)
                curveTo(19.75f, 11.5858f, 19.4142f, 11.25f, 19.0f, 11.25f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 11.25f, 14.25f, 11.5858f, 14.25f, 12.0f)
                curveTo(14.25f, 12.4142f, 14.5858f, 12.75f, 15.0f, 12.75f)
                horizontalLineTo(19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.75f, 9.0f)
                curveTo(19.75f, 9.4142f, 19.4142f, 9.75f, 19.0f, 9.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 9.75f, 13.25f, 9.4142f, 13.25f, 9.0f)
                curveTo(13.25f, 8.5858f, 13.5858f, 8.25f, 14.0f, 8.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 8.25f, 19.75f, 8.5858f, 19.75f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 15.75f)
                curveTo(19.4142f, 15.75f, 19.75f, 15.4142f, 19.75f, 15.0f)
                curveTo(19.75f, 14.5858f, 19.4142f, 14.25f, 19.0f, 14.25f)
                horizontalLineTo(16.0f)
                curveTo(15.5858f, 14.25f, 15.25f, 14.5858f, 15.25f, 15.0f)
                curveTo(15.25f, 15.4142f, 15.5858f, 15.75f, 16.0f, 15.75f)
                horizontalLineTo(19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 3.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 3.25f, 17.3498f, 3.25f, 18.489f, 3.4031f)
                curveTo(19.6614f, 3.5608f, 20.6104f, 3.8929f, 21.3588f, 4.6412f)
                curveTo(22.1071f, 5.3896f, 22.4392f, 6.3386f, 22.5969f, 7.511f)
                curveTo(22.75f, 8.6502f, 22.75f, 10.1058f, 22.75f, 11.9435f)
                verticalLineTo(12.0564f)
                curveTo(22.75f, 13.8942f, 22.75f, 15.3498f, 22.5969f, 16.489f)
                curveTo(22.4392f, 17.6614f, 22.1071f, 18.6104f, 21.3588f, 19.3588f)
                curveTo(20.6104f, 20.1071f, 19.6614f, 20.4392f, 18.489f, 20.5969f)
                curveTo(17.3498f, 20.75f, 15.8942f, 20.75f, 14.0565f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1059f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 10.1058f, 1.25f, 8.6502f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.7516f, 8.7385f, 2.75f, 10.0932f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 19.25f, 17.2615f, 19.2484f, 18.2892f, 19.1102f)
                curveTo(19.2952f, 18.975f, 19.8749f, 18.7213f, 20.2981f, 18.2981f)
                curveTo(20.7213f, 17.8749f, 20.975f, 17.2952f, 21.1102f, 16.2892f)
                curveTo(21.2484f, 15.2615f, 21.25f, 13.9068f, 21.25f, 12.0f)
                curveTo(21.25f, 10.0932f, 21.2484f, 8.7385f, 21.1102f, 7.7108f)
                curveTo(20.975f, 6.7048f, 20.7213f, 6.1251f, 20.2981f, 5.7019f)
                curveTo(19.8749f, 5.2787f, 19.2952f, 5.025f, 18.2892f, 4.8898f)
                curveTo(17.2615f, 4.7516f, 15.9068f, 4.75f, 14.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                close()
            }
        }
            .build()
        return _userId!!
    }

private var _userId: ImageVector? = null
