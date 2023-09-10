package com.chiksmedina.solar.outline.networkitprogramming

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
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Siderbar: ImageVector
    get() {
        if (_siderbar != null) {
            return _siderbar!!
        }
        _siderbar = Builder(
            name = "Siderbar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.5f, 9.25f)
                curveTo(5.0858f, 9.25f, 4.75f, 9.5858f, 4.75f, 10.0f)
                curveTo(4.75f, 10.4142f, 5.0858f, 10.75f, 5.5f, 10.75f)
                horizontalLineTo(11.5f)
                curveTo(11.9142f, 10.75f, 12.25f, 10.4142f, 12.25f, 10.0f)
                curveTo(12.25f, 9.5858f, 11.9142f, 9.25f, 11.5f, 9.25f)
                horizontalLineTo(5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.75f, 14.0f)
                curveTo(5.75f, 13.5858f, 6.0858f, 13.25f, 6.5f, 13.25f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 13.25f, 11.25f, 13.5858f, 11.25f, 14.0f)
                curveTo(11.25f, 14.4142f, 10.9142f, 14.75f, 10.5f, 14.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 14.75f, 5.75f, 14.4142f, 5.75f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 2.25f)
                curveTo(8.1058f, 2.25f, 6.6502f, 2.25f, 5.511f, 2.4031f)
                curveTo(4.3386f, 2.5608f, 3.3896f, 2.8929f, 2.6412f, 3.6412f)
                curveTo(1.8929f, 4.3896f, 1.5608f, 5.3386f, 1.4031f, 6.511f)
                curveTo(1.25f, 7.6502f, 1.25f, 9.1058f, 1.25f, 10.9436f)
                verticalLineTo(13.0564f)
                curveTo(1.25f, 14.8942f, 1.25f, 16.3498f, 1.4031f, 17.489f)
                curveTo(1.5608f, 18.6614f, 1.8929f, 19.6104f, 2.6412f, 20.3588f)
                curveTo(3.3896f, 21.1071f, 4.3386f, 21.4392f, 5.511f, 21.5969f)
                curveTo(6.6502f, 21.75f, 8.1058f, 21.75f, 9.9435f, 21.75f)
                horizontalLineTo(14.0564f)
                curveTo(14.3706f, 21.75f, 14.6738f, 21.75f, 14.966f, 21.7492f)
                curveTo(14.9773f, 21.7497f, 14.9886f, 21.75f, 15.0f, 21.75f)
                curveTo(15.0129f, 21.75f, 15.0257f, 21.7497f, 15.0384f, 21.749f)
                curveTo(16.4224f, 21.7448f, 17.5607f, 21.7217f, 18.489f, 21.5969f)
                curveTo(19.6614f, 21.4392f, 20.6104f, 21.1071f, 21.3588f, 20.3588f)
                curveTo(22.1071f, 19.6104f, 22.4392f, 18.6614f, 22.5969f, 17.489f)
                curveTo(22.75f, 16.3498f, 22.75f, 14.8942f, 22.75f, 13.0565f)
                verticalLineTo(10.9436f)
                curveTo(22.75f, 9.1059f, 22.75f, 7.6502f, 22.5969f, 6.511f)
                curveTo(22.4392f, 5.3386f, 22.1071f, 4.3896f, 21.3588f, 3.6412f)
                curveTo(20.6104f, 2.8929f, 19.6614f, 2.5608f, 18.489f, 2.4031f)
                curveTo(17.5607f, 2.2783f, 16.4224f, 2.2552f, 15.0384f, 2.251f)
                curveTo(15.0257f, 2.2503f, 15.0129f, 2.25f, 15.0f, 2.25f)
                curveTo(14.9886f, 2.25f, 14.9773f, 2.2503f, 14.966f, 2.2508f)
                curveTo(14.6737f, 2.25f, 14.3707f, 2.25f, 14.0564f, 2.25f)
                horizontalLineTo(9.9436f)
                close()
                moveTo(14.25f, 3.75f)
                curveTo(14.1677f, 3.75f, 14.0844f, 3.75f, 14.0f, 3.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 3.75f, 6.7385f, 3.7516f, 5.7108f, 3.8898f)
                curveTo(4.7048f, 4.025f, 4.1251f, 4.2787f, 3.7019f, 4.7019f)
                curveTo(3.2787f, 5.1251f, 3.025f, 5.7048f, 2.8898f, 6.7108f)
                curveTo(2.7516f, 7.7385f, 2.75f, 9.0932f, 2.75f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.75f, 14.9068f, 2.7516f, 16.2615f, 2.8898f, 17.2892f)
                curveTo(3.025f, 18.2952f, 3.2787f, 18.8749f, 3.7019f, 19.2981f)
                curveTo(4.1251f, 19.7213f, 4.7048f, 19.975f, 5.7108f, 20.1102f)
                curveTo(6.7385f, 20.2484f, 8.0932f, 20.25f, 10.0f, 20.25f)
                horizontalLineTo(14.0f)
                curveTo(14.0844f, 20.25f, 14.1677f, 20.25f, 14.25f, 20.25f)
                lineTo(14.25f, 3.75f)
                close()
                moveTo(15.75f, 20.2443f)
                curveTo(16.7836f, 20.2334f, 17.6082f, 20.2018f, 18.2892f, 20.1102f)
                curveTo(19.2952f, 19.975f, 19.8749f, 19.7213f, 20.2981f, 19.2981f)
                curveTo(20.7213f, 18.8749f, 20.975f, 18.2952f, 21.1102f, 17.2892f)
                curveTo(21.2484f, 16.2615f, 21.25f, 14.9068f, 21.25f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.25f, 9.0932f, 21.2484f, 7.7385f, 21.1102f, 6.7108f)
                curveTo(20.975f, 5.7048f, 20.7213f, 5.1251f, 20.2981f, 4.7019f)
                curveTo(19.8749f, 4.2787f, 19.2952f, 4.025f, 18.2892f, 3.8898f)
                curveTo(17.6082f, 3.7982f, 16.7836f, 3.7666f, 15.75f, 3.7557f)
                lineTo(15.75f, 20.2443f)
                close()
            }
        }
            .build()
        return _siderbar!!
    }

private var _siderbar: ImageVector? = null
