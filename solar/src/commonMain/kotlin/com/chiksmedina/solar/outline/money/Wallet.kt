package com.chiksmedina.solar.outline.money

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
import com.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(
            name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 12.5523f, 18.5523f, 13.0f, 18.0f, 13.0f)
                curveTo(17.4477f, 13.0f, 17.0f, 12.5523f, 17.0f, 12.0f)
                curveTo(17.0f, 11.4477f, 17.4477f, 11.0f, 18.0f, 11.0f)
                curveTo(18.5523f, 11.0f, 19.0f, 11.4477f, 19.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 3.25f)
                horizontalLineTo(13.0564f)
                curveTo(14.8942f, 3.25f, 16.3498f, 3.25f, 17.489f, 3.4031f)
                curveTo(18.6614f, 3.5608f, 19.6104f, 3.8929f, 20.3588f, 4.6412f)
                curveTo(21.2831f, 5.5656f, 21.5777f, 6.8036f, 21.6847f, 8.4101f)
                curveTo(22.2619f, 8.6641f, 22.6978f, 9.2013f, 22.7458f, 9.8818f)
                curveTo(22.7501f, 9.942f, 22.75f, 10.0069f, 22.75f, 10.067f)
                curveTo(22.75f, 10.0725f, 22.75f, 10.0779f, 22.75f, 10.0833f)
                verticalLineTo(13.9167f)
                curveTo(22.75f, 13.9221f, 22.75f, 13.9275f, 22.75f, 13.933f)
                curveTo(22.75f, 13.9931f, 22.7501f, 14.058f, 22.7458f, 14.1182f)
                curveTo(22.6978f, 14.7987f, 22.2619f, 15.3359f, 21.6847f, 15.5899f)
                curveTo(21.5777f, 17.1964f, 21.2831f, 18.4344f, 20.3588f, 19.3588f)
                curveTo(19.6104f, 20.1071f, 18.6614f, 20.4392f, 17.489f, 20.5969f)
                curveTo(16.3498f, 20.75f, 14.8942f, 20.75f, 13.0564f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 10.1058f, 1.25f, 8.6502f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(20.1679f, 15.75f)
                horizontalLineTo(18.2308f)
                curveTo(16.0856f, 15.75f, 14.25f, 14.1224f, 14.25f, 12.0f)
                curveTo(14.25f, 9.8776f, 16.0856f, 8.25f, 18.2308f, 8.25f)
                horizontalLineTo(20.1679f)
                curveTo(20.0541f, 6.9085f, 19.7966f, 6.2004f, 19.2981f, 5.7019f)
                curveTo(18.8749f, 5.2787f, 18.2952f, 5.025f, 17.2892f, 4.8898f)
                curveTo(16.2615f, 4.7516f, 14.9068f, 4.75f, 13.0f, 4.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 4.75f, 6.7385f, 4.7516f, 5.7108f, 4.8898f)
                curveTo(4.7048f, 5.025f, 4.1251f, 5.2787f, 3.7019f, 5.7019f)
                curveTo(3.2787f, 6.1251f, 3.025f, 6.7048f, 2.8898f, 7.7108f)
                curveTo(2.7516f, 8.7385f, 2.75f, 10.0932f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 19.25f, 16.2615f, 19.2484f, 17.2892f, 19.1102f)
                curveTo(18.2952f, 18.975f, 18.8749f, 18.7213f, 19.2981f, 18.2981f)
                curveTo(19.7966f, 17.7996f, 20.0541f, 17.0915f, 20.1679f, 15.75f)
                close()
                moveTo(5.25f, 8.0f)
                curveTo(5.25f, 7.5858f, 5.5858f, 7.25f, 6.0f, 7.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 7.25f, 10.75f, 7.5858f, 10.75f, 8.0f)
                curveTo(10.75f, 8.4142f, 10.4142f, 8.75f, 10.0f, 8.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 8.75f, 5.25f, 8.4142f, 5.25f, 8.0f)
                close()
                moveTo(20.9235f, 9.7502f)
                curveTo(20.9032f, 9.75f, 20.8766f, 9.75f, 20.8333f, 9.75f)
                horizontalLineTo(18.2308f)
                curveTo(16.8074f, 9.75f, 15.75f, 10.8087f, 15.75f, 12.0f)
                curveTo(15.75f, 13.1913f, 16.8074f, 14.25f, 18.2308f, 14.25f)
                horizontalLineTo(20.8333f)
                curveTo(20.8766f, 14.25f, 20.9032f, 14.25f, 20.9235f, 14.2498f)
                curveTo(20.936f, 14.2496f, 20.9426f, 14.2495f, 20.9457f, 14.2493f)
                lineTo(20.9479f, 14.2492f)
                curveTo(21.1541f, 14.2367f, 21.2427f, 14.0976f, 21.2495f, 14.0139f)
                curveTo(21.2495f, 14.0139f, 21.2497f, 14.0076f, 21.2498f, 13.9986f)
                curveTo(21.25f, 13.9808f, 21.25f, 13.9572f, 21.25f, 13.9167f)
                verticalLineTo(10.0833f)
                curveTo(21.25f, 10.0428f, 21.25f, 10.0192f, 21.2498f, 10.0014f)
                curveTo(21.2497f, 9.9924f, 21.2495f, 9.9861f, 21.2495f, 9.9861f)
                curveTo(21.2427f, 9.9024f, 21.1541f, 9.7633f, 20.9479f, 9.7508f)
                curveTo(20.9479f, 9.7508f, 20.943f, 9.7504f, 20.9235f, 9.7502f)
                close()
            }
        }
            .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
