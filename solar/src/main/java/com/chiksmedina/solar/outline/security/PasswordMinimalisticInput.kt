package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.outline.SecurityGroup

public val SecurityGroup.PasswordMinimalisticInput: ImageVector
    get() {
        if (_passwordMinimalisticInput != null) {
            return _passwordMinimalisticInput!!
        }
        _passwordMinimalisticInput = Builder(name = "PasswordMinimalisticInput", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 2.0f)
                curveTo(15.75f, 1.5858f, 15.4142f, 1.25f, 15.0f, 1.25f)
                curveTo(14.5858f, 1.25f, 14.25f, 1.5858f, 14.25f, 2.0f)
                verticalLineTo(4.0002f)
                curveTo(14.25f, 4.0007f, 14.25f, 4.0012f, 14.25f, 4.0018f)
                verticalLineTo(19.9982f)
                curveTo(14.25f, 19.9988f, 14.25f, 19.9993f, 14.25f, 19.9998f)
                verticalLineTo(22.0f)
                curveTo(14.25f, 22.4142f, 14.5858f, 22.75f, 15.0f, 22.75f)
                curveTo(15.4142f, 22.75f, 15.75f, 22.4142f, 15.75f, 22.0f)
                verticalLineTo(20.7445f)
                curveTo(16.9594f, 20.7321f, 17.9701f, 20.6908f, 18.8089f, 20.5484f)
                curveTo(19.8369f, 20.374f, 20.6807f, 20.0368f, 21.3588f, 19.3588f)
                curveTo(22.1071f, 18.6104f, 22.4392f, 17.6614f, 22.5969f, 16.489f)
                curveTo(22.75f, 15.3498f, 22.75f, 13.8942f, 22.75f, 12.0565f)
                verticalLineTo(11.9436f)
                curveTo(22.75f, 10.1058f, 22.75f, 8.6502f, 22.5969f, 7.511f)
                curveTo(22.4392f, 6.3386f, 22.1071f, 5.3896f, 21.3588f, 4.6412f)
                curveTo(20.6807f, 3.9632f, 19.8369f, 3.626f, 18.8089f, 3.4516f)
                curveTo(17.9701f, 3.3093f, 16.9594f, 3.2679f, 15.75f, 3.2555f)
                verticalLineTo(2.0f)
                close()
                moveTo(15.75f, 4.7557f)
                verticalLineTo(19.2443f)
                curveTo(16.9362f, 19.2316f, 17.8391f, 19.1915f, 18.558f, 19.0696f)
                curveTo(19.3998f, 18.9267f, 19.9131f, 18.6831f, 20.2981f, 18.2981f)
                curveTo(20.7213f, 17.8749f, 20.975f, 17.2952f, 21.1102f, 16.2892f)
                curveTo(21.2484f, 15.2615f, 21.25f, 13.9068f, 21.25f, 12.0f)
                curveTo(21.25f, 10.0932f, 21.2484f, 8.7385f, 21.1102f, 7.7108f)
                curveTo(20.975f, 6.7048f, 20.7213f, 6.1251f, 20.2981f, 5.7019f)
                curveTo(19.9131f, 5.3169f, 19.3998f, 5.0733f, 18.558f, 4.9304f)
                curveTo(17.8391f, 4.8085f, 16.9362f, 4.7684f, 15.75f, 4.7557f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9436f, 3.25f)
                curveTo(8.1058f, 3.25f, 6.6502f, 3.25f, 5.511f, 3.4031f)
                curveTo(4.3386f, 3.5608f, 3.3896f, 3.8929f, 2.6412f, 4.6412f)
                curveTo(1.8929f, 5.3896f, 1.5608f, 6.3386f, 1.4031f, 7.511f)
                curveTo(1.25f, 8.6502f, 1.25f, 10.1058f, 1.25f, 11.9436f)
                verticalLineTo(12.0564f)
                curveTo(1.25f, 13.8942f, 1.25f, 15.3498f, 1.4031f, 16.489f)
                curveTo(1.5608f, 17.6614f, 1.8929f, 18.6104f, 2.6412f, 19.3588f)
                curveTo(3.3896f, 20.1071f, 4.3386f, 20.4392f, 5.511f, 20.5969f)
                curveTo(6.6502f, 20.75f, 8.1058f, 20.75f, 9.9435f, 20.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 20.75f, 12.75f, 20.4142f, 12.75f, 20.0f)
                curveTo(12.75f, 19.5858f, 12.4142f, 19.25f, 12.0f, 19.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 19.25f, 6.7385f, 19.2484f, 5.7108f, 19.1102f)
                curveTo(4.7048f, 18.975f, 4.1251f, 18.7213f, 3.7019f, 18.2981f)
                curveTo(3.2787f, 17.8749f, 3.025f, 17.2952f, 2.8898f, 16.2892f)
                curveTo(2.7516f, 15.2615f, 2.75f, 13.9068f, 2.75f, 12.0f)
                curveTo(2.75f, 10.0932f, 2.7516f, 8.7385f, 2.8898f, 7.7108f)
                curveTo(3.025f, 6.7048f, 3.2787f, 6.1251f, 3.7019f, 5.7019f)
                curveTo(4.1251f, 5.2787f, 4.7048f, 5.025f, 5.7108f, 4.8898f)
                curveTo(6.7385f, 4.7516f, 8.0932f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 4.75f, 12.75f, 4.4142f, 12.75f, 4.0f)
                curveTo(12.75f, 3.5858f, 12.4142f, 3.25f, 12.0f, 3.25f)
                lineTo(9.9436f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                curveTo(8.5523f, 13.0f, 9.0f, 12.5523f, 9.0f, 12.0f)
                curveTo(9.0f, 11.4477f, 8.5523f, 11.0f, 8.0f, 11.0f)
                curveTo(7.4477f, 11.0f, 7.0f, 11.4477f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5523f, 7.4477f, 13.0f, 8.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
                curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                curveTo(11.0f, 11.4477f, 11.4477f, 11.0f, 12.0f, 11.0f)
                curveTo(12.5523f, 11.0f, 13.0f, 11.4477f, 13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _passwordMinimalisticInput!!
    }

private var _passwordMinimalisticInput: ImageVector? = null
