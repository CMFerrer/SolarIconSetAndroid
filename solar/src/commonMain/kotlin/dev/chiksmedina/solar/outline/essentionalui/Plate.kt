package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Plate: ImageVector
    get() {
        if (_plate != null) {
            return _plate!!
        }
        _plate = Builder(
            name = "Plate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 3.0f)
                curveTo(12.75f, 2.5858f, 12.4142f, 2.25f, 12.0f, 2.25f)
                curveTo(11.5858f, 2.25f, 11.25f, 2.5858f, 11.25f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 5.4142f, 11.5858f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0022f, 4.7509f)
                curveTo(9.4164f, 4.7497f, 9.7512f, 4.413f, 9.75f, 3.9987f)
                curveTo(9.7488f, 3.5845f, 9.412f, 3.2497f, 8.9978f, 3.2509f)
                curveTo(7.4507f, 3.2555f, 6.1973f, 3.2809f, 5.1911f, 3.4516f)
                curveTo(4.1631f, 3.626f, 3.3193f, 3.9632f, 2.6412f, 4.6412f)
                curveTo(1.8929f, 5.3896f, 1.5608f, 6.3386f, 1.4031f, 7.511f)
                curveTo(1.25f, 8.6502f, 1.25f, 10.1058f, 1.25f, 11.9436f)
                verticalLineTo(12.0564f)
                curveTo(1.25f, 13.8942f, 1.25f, 15.3498f, 1.4031f, 16.489f)
                curveTo(1.5608f, 17.6614f, 1.8929f, 18.6104f, 2.6412f, 19.3588f)
                curveTo(3.3896f, 20.1071f, 4.3386f, 20.4392f, 5.511f, 20.5969f)
                curveTo(6.6502f, 20.75f, 8.1058f, 20.75f, 9.9435f, 20.75f)
                horizontalLineTo(14.0565f)
                curveTo(15.8942f, 20.75f, 17.3498f, 20.75f, 18.489f, 20.5969f)
                curveTo(19.6614f, 20.4392f, 20.6104f, 20.1071f, 21.3588f, 19.3588f)
                curveTo(22.1071f, 18.6104f, 22.4392f, 17.6614f, 22.5969f, 16.489f)
                curveTo(22.75f, 15.3498f, 22.75f, 13.8942f, 22.75f, 12.0565f)
                verticalLineTo(11.9436f)
                curveTo(22.75f, 10.1059f, 22.75f, 8.6502f, 22.5969f, 7.511f)
                curveTo(22.4392f, 6.3386f, 22.1071f, 5.3896f, 21.3588f, 4.6412f)
                curveTo(20.6807f, 3.9632f, 19.8369f, 3.626f, 18.8089f, 3.4516f)
                curveTo(17.8027f, 3.2809f, 16.5493f, 3.2555f, 15.0022f, 3.2509f)
                curveTo(14.588f, 3.2497f, 14.2512f, 3.5845f, 14.25f, 3.9987f)
                curveTo(14.2488f, 4.413f, 14.5836f, 4.7497f, 14.9978f, 4.7509f)
                curveTo(16.565f, 4.7555f, 17.6943f, 4.7839f, 18.558f, 4.9304f)
                curveTo(19.3998f, 5.0733f, 19.9131f, 5.3169f, 20.2981f, 5.7019f)
                curveTo(20.7213f, 6.1251f, 20.975f, 6.7048f, 21.1102f, 7.7108f)
                curveTo(21.2484f, 8.7385f, 21.25f, 10.0932f, 21.25f, 12.0f)
                curveTo(21.25f, 13.9068f, 21.2484f, 15.2615f, 21.1102f, 16.2892f)
                curveTo(20.975f, 17.2952f, 20.7213f, 17.8749f, 20.2981f, 18.2981f)
                curveTo(19.8749f, 18.7213f, 19.2952f, 18.975f, 18.2892f, 19.1102f)
                curveTo(17.2615f, 19.2484f, 15.9068f, 19.25f, 14.0f, 19.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 19.25f, 6.7385f, 19.2484f, 5.7108f, 19.1102f)
                curveTo(4.7048f, 18.975f, 4.1251f, 18.7213f, 3.7019f, 18.2981f)
                curveTo(3.2787f, 17.8749f, 3.025f, 17.2952f, 2.8898f, 16.2892f)
                curveTo(2.7516f, 15.2615f, 2.75f, 13.9068f, 2.75f, 12.0f)
                curveTo(2.75f, 10.0932f, 2.7516f, 8.7385f, 2.8898f, 7.7108f)
                curveTo(3.025f, 6.7048f, 3.2787f, 6.1251f, 3.7019f, 5.7019f)
                curveTo(4.0869f, 5.3169f, 4.6002f, 5.0733f, 5.442f, 4.9304f)
                curveTo(6.3057f, 4.7839f, 7.435f, 4.7555f, 9.0022f, 4.7509f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.25f, 10.5f)
                curveTo(7.25f, 10.0858f, 7.5858f, 9.75f, 8.0f, 9.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 9.75f, 16.75f, 10.0858f, 16.75f, 10.5f)
                curveTo(16.75f, 10.9142f, 16.4142f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 11.25f, 7.25f, 10.9142f, 7.25f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 13.25f)
                curveTo(7.5858f, 13.25f, 7.25f, 13.5858f, 7.25f, 14.0f)
                curveTo(7.25f, 14.4142f, 7.5858f, 14.75f, 8.0f, 14.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 14.75f, 14.25f, 14.4142f, 14.25f, 14.0f)
                curveTo(14.25f, 13.5858f, 13.9142f, 13.25f, 13.5f, 13.25f)
                horizontalLineTo(8.0f)
                close()
            }
        }
            .build()
        return _plate!!
    }

private var _plate: ImageVector? = null
