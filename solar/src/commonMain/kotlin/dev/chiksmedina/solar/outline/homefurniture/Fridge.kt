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

val HomeFurnitureGroup.Fridge: ImageVector
    get() {
        if (_fridge != null) {
            return _fridge!!
        }
        _fridge = Builder(
            name = "Fridge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.75f, 7.0f)
                curveTo(17.75f, 6.5858f, 17.4142f, 6.25f, 17.0f, 6.25f)
                curveTo(16.5858f, 6.25f, 16.25f, 6.5858f, 16.25f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(16.25f, 9.4142f, 16.5858f, 9.75f, 17.0f, 9.75f)
                curveTo(17.4142f, 9.75f, 17.75f, 9.4142f, 17.75f, 9.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.75f, 14.0f)
                curveTo(17.75f, 13.5858f, 17.4142f, 13.25f, 17.0f, 13.25f)
                curveTo(16.5858f, 13.25f, 16.25f, 13.5858f, 16.25f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(16.25f, 16.4142f, 16.5858f, 16.75f, 17.0f, 16.75f)
                curveTo(17.4142f, 16.75f, 17.75f, 16.4142f, 17.75f, 16.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0564f, 1.25f)
                horizontalLineTo(11.9436f)
                curveTo(10.1058f, 1.25f, 8.6502f, 1.25f, 7.511f, 1.4031f)
                curveTo(6.3386f, 1.5608f, 5.3896f, 1.8929f, 4.6412f, 2.6412f)
                curveTo(3.8929f, 3.3896f, 3.5608f, 4.3386f, 3.4031f, 5.511f)
                curveTo(3.25f, 6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f)
                verticalLineTo(13.0564f)
                curveTo(3.25f, 14.8942f, 3.25f, 16.3498f, 3.4031f, 17.489f)
                curveTo(3.5608f, 18.6614f, 3.8929f, 19.6104f, 4.6412f, 20.3588f)
                curveTo(5.1003f, 20.8178f, 5.6348f, 21.1202f, 6.25f, 21.3218f)
                verticalLineTo(22.0f)
                curveTo(6.25f, 22.4142f, 6.5858f, 22.75f, 7.0f, 22.75f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 22.75f, 8.75f, 22.4142f, 8.75f, 22.0f)
                verticalLineTo(21.7042f)
                curveTo(9.6568f, 21.75f, 10.7147f, 21.75f, 11.9435f, 21.75f)
                horizontalLineTo(12.0564f)
                curveTo(13.2852f, 21.75f, 14.3432f, 21.75f, 15.25f, 21.7042f)
                verticalLineTo(22.0f)
                curveTo(15.25f, 22.4142f, 15.5858f, 22.75f, 16.0f, 22.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 22.75f, 17.75f, 22.4142f, 17.75f, 22.0f)
                verticalLineTo(21.3218f)
                curveTo(18.3652f, 21.1202f, 18.8997f, 20.8178f, 19.3588f, 20.3588f)
                curveTo(20.1071f, 19.6104f, 20.4392f, 18.6614f, 20.5969f, 17.489f)
                curveTo(20.75f, 16.3498f, 20.75f, 14.8942f, 20.75f, 13.0565f)
                verticalLineTo(9.9436f)
                curveTo(20.75f, 8.1059f, 20.75f, 6.6502f, 20.5969f, 5.511f)
                curveTo(20.4392f, 4.3386f, 20.1071f, 3.3896f, 19.3588f, 2.6412f)
                curveTo(18.6104f, 1.8929f, 17.6614f, 1.5608f, 16.489f, 1.4031f)
                curveTo(15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f, 1.25f)
                close()
                moveTo(5.7019f, 3.7019f)
                curveTo(6.1251f, 3.2787f, 6.7048f, 3.025f, 7.7108f, 2.8898f)
                curveTo(8.7385f, 2.7516f, 10.0932f, 2.75f, 12.0f, 2.75f)
                curveTo(13.9068f, 2.75f, 15.2615f, 2.7516f, 16.2892f, 2.8898f)
                curveTo(17.2952f, 3.025f, 17.8749f, 3.2787f, 18.2981f, 3.7019f)
                curveTo(18.7213f, 4.1251f, 18.975f, 4.7048f, 19.1102f, 5.7108f)
                curveTo(19.2484f, 6.7385f, 19.25f, 8.0932f, 19.25f, 10.0f)
                verticalLineTo(10.75f)
                horizontalLineTo(4.75f)
                verticalLineTo(10.0f)
                curveTo(4.75f, 8.0932f, 4.7516f, 6.7385f, 4.8898f, 5.7108f)
                curveTo(5.025f, 4.7048f, 5.2787f, 4.1251f, 5.7019f, 3.7019f)
                close()
                moveTo(4.75f, 12.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(13.0f)
                curveTo(19.25f, 14.9068f, 19.2484f, 16.2615f, 19.1102f, 17.2892f)
                curveTo(18.975f, 18.2952f, 18.7213f, 18.8749f, 18.2981f, 19.2981f)
                curveTo(17.8749f, 19.7213f, 17.2952f, 19.975f, 16.2892f, 20.1102f)
                curveTo(15.2615f, 20.2484f, 13.9068f, 20.25f, 12.0f, 20.25f)
                curveTo(10.0932f, 20.25f, 8.7385f, 20.2484f, 7.7108f, 20.1102f)
                curveTo(6.7048f, 19.975f, 6.1251f, 19.7213f, 5.7019f, 19.2981f)
                curveTo(5.2787f, 18.8749f, 5.025f, 18.2952f, 4.8898f, 17.2892f)
                curveTo(4.7516f, 16.2615f, 4.75f, 14.9068f, 4.75f, 13.0f)
                verticalLineTo(12.25f)
                close()
            }
        }
            .build()
        return _fridge!!
    }

private var _fridge: ImageVector? = null
