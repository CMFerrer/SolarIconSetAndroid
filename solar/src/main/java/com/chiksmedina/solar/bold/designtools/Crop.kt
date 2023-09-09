package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

public val DesignToolsGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 1.25f)
                curveTo(5.4142f, 1.25f, 5.75f, 1.5858f, 5.75f, 2.0f)
                verticalLineTo(11.0f)
                curveTo(5.75f, 12.9068f, 5.7516f, 14.2615f, 5.8898f, 15.2892f)
                curveTo(6.025f, 16.2952f, 6.2787f, 16.8749f, 6.7019f, 17.2981f)
                curveTo(7.1251f, 17.7213f, 7.7048f, 17.975f, 8.7108f, 18.1102f)
                curveTo(9.7385f, 18.2484f, 11.0932f, 18.25f, 13.0f, 18.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 18.25f, 22.75f, 18.5858f, 22.75f, 19.0f)
                curveTo(22.75f, 19.4142f, 22.4142f, 19.75f, 22.0f, 19.75f)
                horizontalLineTo(19.75f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(12.9436f)
                curveTo(11.1058f, 19.75f, 9.6502f, 19.75f, 8.511f, 19.5969f)
                curveTo(7.3386f, 19.4392f, 6.3896f, 19.1071f, 5.6412f, 18.3588f)
                curveTo(4.8929f, 17.6104f, 4.5608f, 16.6614f, 4.4031f, 15.489f)
                curveTo(4.25f, 14.3498f, 4.25f, 12.8942f, 4.25f, 11.0564f)
                lineTo(4.25f, 5.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 5.75f, 1.25f, 5.4142f, 1.25f, 5.0f)
                curveTo(1.25f, 4.5858f, 1.5858f, 4.25f, 2.0f, 4.25f)
                horizontalLineTo(4.25f)
                verticalLineTo(2.0f)
                curveTo(4.25f, 1.5858f, 4.5858f, 1.25f, 5.0f, 1.25f)
                close()
                moveTo(15.2892f, 5.8898f)
                curveTo(14.2615f, 5.7516f, 12.9068f, 5.75f, 11.0f, 5.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 5.75f, 7.25f, 5.4142f, 7.25f, 5.0f)
                curveTo(7.25f, 4.5858f, 7.5858f, 4.25f, 8.0f, 4.25f)
                lineTo(11.0564f, 4.25f)
                curveTo(12.8942f, 4.25f, 14.3498f, 4.25f, 15.489f, 4.4031f)
                curveTo(16.6614f, 4.5608f, 17.6104f, 4.8929f, 18.3588f, 5.6412f)
                curveTo(19.1071f, 6.3896f, 19.4392f, 7.3386f, 19.5969f, 8.511f)
                curveTo(19.75f, 9.6502f, 19.75f, 11.1058f, 19.75f, 12.9436f)
                verticalLineTo(16.0f)
                curveTo(19.75f, 16.4142f, 19.4142f, 16.75f, 19.0f, 16.75f)
                curveTo(18.5858f, 16.75f, 18.25f, 16.4142f, 18.25f, 16.0f)
                verticalLineTo(13.0f)
                curveTo(18.25f, 11.0932f, 18.2484f, 9.7385f, 18.1102f, 8.7108f)
                curveTo(17.975f, 7.7048f, 17.7213f, 7.1251f, 17.2981f, 6.7019f)
                curveTo(16.8749f, 6.2787f, 16.2952f, 6.025f, 15.2892f, 5.8898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 11.5f)
                curveTo(8.5f, 10.0858f, 8.5f, 9.3787f, 8.9393f, 8.9393f)
                curveTo(9.3787f, 8.5f, 10.0858f, 8.5f, 11.5f, 8.5f)
                horizontalLineTo(12.5f)
                curveTo(13.9142f, 8.5f, 14.6213f, 8.5f, 15.0607f, 8.9393f)
                curveTo(15.5f, 9.3787f, 15.5f, 10.0858f, 15.5f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(15.5f, 13.9142f, 15.5f, 14.6213f, 15.0607f, 15.0607f)
                curveTo(14.6213f, 15.5f, 13.9142f, 15.5f, 12.5f, 15.5f)
                horizontalLineTo(11.5f)
                curveTo(10.0858f, 15.5f, 9.3787f, 15.5f, 8.9393f, 15.0607f)
                curveTo(8.5f, 14.6213f, 8.5f, 13.9142f, 8.5f, 12.5f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null
