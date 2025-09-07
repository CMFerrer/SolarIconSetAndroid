package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Card2: ImageVector
    get() {
        if (_card2 != null) {
            return _card2!!
        }
        _card2 = Builder(
            name = "Card2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
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
                curveTo(22.6873f, 8.1839f, 22.7244f, 8.9671f, 22.7395f, 9.8743f)
                curveTo(22.7464f, 9.9152f, 22.75f, 9.9572f, 22.75f, 10.0f)
                curveTo(22.75f, 10.0353f, 22.7476f, 10.0699f, 22.7429f, 10.1039f)
                curveTo(22.75f, 10.6696f, 22.75f, 11.2818f, 22.75f, 11.9436f)
                verticalLineTo(12.0564f)
                curveTo(22.75f, 13.8942f, 22.75f, 15.3498f, 22.5969f, 16.489f)
                curveTo(22.4392f, 17.6614f, 22.1071f, 18.6104f, 21.3588f, 19.3588f)
                curveTo(20.6104f, 20.1071f, 19.6614f, 20.4392f, 18.489f, 20.5969f)
                curveTo(17.3498f, 20.75f, 15.8942f, 20.75f, 14.0564f, 20.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 20.75f, 6.6502f, 20.75f, 5.511f, 20.5969f)
                curveTo(4.3386f, 20.4392f, 3.3896f, 20.1071f, 2.6412f, 19.3588f)
                curveTo(1.8929f, 18.6104f, 1.5608f, 17.6614f, 1.4031f, 16.489f)
                curveTo(1.25f, 15.3498f, 1.25f, 13.8942f, 1.25f, 12.0564f)
                verticalLineTo(11.9436f)
                curveTo(1.25f, 11.2818f, 1.25f, 10.6696f, 1.2571f, 10.1039f)
                curveTo(1.2524f, 10.0699f, 1.25f, 10.0352f, 1.25f, 10.0f)
                curveTo(1.25f, 9.9572f, 1.2536f, 9.9152f, 1.2605f, 9.8743f)
                curveTo(1.2756f, 8.9671f, 1.3127f, 8.1839f, 1.4031f, 7.511f)
                curveTo(1.5608f, 6.3386f, 1.8929f, 5.3896f, 2.6412f, 4.6412f)
                curveTo(3.3896f, 3.8929f, 4.3386f, 3.5608f, 5.511f, 3.4031f)
                curveTo(6.6502f, 3.25f, 8.1058f, 3.25f, 9.9436f, 3.25f)
                close()
                moveTo(2.752f, 10.75f)
                curveTo(2.7501f, 11.1384f, 2.75f, 11.5541f, 2.75f, 12.0f)
                curveTo(2.75f, 13.9068f, 2.7516f, 15.2615f, 2.8898f, 16.2892f)
                curveTo(3.025f, 17.2952f, 3.2787f, 17.8749f, 3.7019f, 18.2981f)
                curveTo(4.1251f, 18.7213f, 4.7048f, 18.975f, 5.7108f, 19.1102f)
                curveTo(6.7385f, 19.2484f, 8.0932f, 19.25f, 10.0f, 19.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 19.25f, 17.2615f, 19.2484f, 18.2892f, 19.1102f)
                curveTo(19.2952f, 18.975f, 19.8749f, 18.7213f, 20.2981f, 18.2981f)
                curveTo(20.7213f, 17.8749f, 20.975f, 17.2952f, 21.1102f, 16.2892f)
                curveTo(21.2484f, 15.2615f, 21.25f, 13.9068f, 21.25f, 12.0f)
                curveTo(21.25f, 11.5541f, 21.2499f, 11.1384f, 21.248f, 10.75f)
                horizontalLineTo(2.752f)
                close()
                moveTo(21.2239f, 9.25f)
                horizontalLineTo(2.7761f)
                curveTo(2.7956f, 8.6633f, 2.8299f, 8.1563f, 2.8898f, 7.7108f)
                curveTo(3.025f, 6.7048f, 3.2787f, 6.1251f, 3.7019f, 5.7019f)
                curveTo(4.1251f, 5.2787f, 4.7048f, 5.025f, 5.7108f, 4.8898f)
                curveTo(6.7385f, 4.7516f, 8.0932f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 4.75f, 17.2615f, 4.7516f, 18.2892f, 4.8898f)
                curveTo(19.2952f, 5.025f, 19.8749f, 5.2787f, 20.2981f, 5.7019f)
                curveTo(20.7213f, 6.1251f, 20.975f, 6.7048f, 21.1102f, 7.7108f)
                curveTo(21.1701f, 8.1563f, 21.2044f, 8.6633f, 21.2239f, 9.25f)
                close()
                moveTo(15.9553f, 12.25f)
                horizontalLineTo(16.0447f)
                curveTo(16.4776f, 12.2499f, 16.8744f, 12.2499f, 17.1972f, 12.2933f)
                curveTo(17.5527f, 12.3411f, 17.9284f, 12.4535f, 18.2374f, 12.7626f)
                curveTo(18.5465f, 13.0716f, 18.6589f, 13.4473f, 18.7067f, 13.8028f)
                curveTo(18.7501f, 14.1256f, 18.7501f, 14.5224f, 18.75f, 14.9553f)
                verticalLineTo(15.0447f)
                curveTo(18.7501f, 15.4776f, 18.7501f, 15.8744f, 18.7067f, 16.1972f)
                curveTo(18.6589f, 16.5527f, 18.5465f, 16.9284f, 18.2374f, 17.2374f)
                curveTo(17.9284f, 17.5465f, 17.5527f, 17.6589f, 17.1972f, 17.7067f)
                curveTo(16.8744f, 17.7501f, 16.4776f, 17.7501f, 16.0447f, 17.75f)
                horizontalLineTo(15.9553f)
                curveTo(15.5224f, 17.7501f, 15.1256f, 17.7501f, 14.8028f, 17.7067f)
                curveTo(14.4473f, 17.6589f, 14.0716f, 17.5465f, 13.7626f, 17.2374f)
                curveTo(13.4535f, 16.9284f, 13.3411f, 16.5527f, 13.2933f, 16.1972f)
                curveTo(13.2499f, 15.8744f, 13.2499f, 15.4776f, 13.25f, 15.0447f)
                verticalLineTo(14.9553f)
                curveTo(13.2499f, 14.5224f, 13.2499f, 14.1256f, 13.2933f, 13.8028f)
                curveTo(13.3411f, 13.4473f, 13.4535f, 13.0716f, 13.7626f, 12.7626f)
                curveTo(14.0716f, 12.4535f, 14.4473f, 12.3411f, 14.8028f, 12.2933f)
                curveTo(15.1256f, 12.2499f, 15.5224f, 12.2499f, 15.9553f, 12.25f)
                close()
                moveTo(14.8257f, 13.8219f)
                lineTo(14.8232f, 13.8232f)
                lineTo(14.8219f, 13.8257f)
                curveTo(14.8209f, 13.8276f, 14.8192f, 13.8309f, 14.8172f, 13.836f)
                curveTo(14.8082f, 13.8577f, 14.7929f, 13.9061f, 14.7799f, 14.0027f)
                curveTo(14.7516f, 14.2134f, 14.75f, 14.5074f, 14.75f, 15.0f)
                curveTo(14.75f, 15.4926f, 14.7516f, 15.7866f, 14.7799f, 15.9973f)
                curveTo(14.7929f, 16.0939f, 14.8082f, 16.1423f, 14.8172f, 16.164f)
                curveTo(14.818f, 16.1661f, 14.8188f, 16.1679f, 14.8195f, 16.1694f)
                curveTo(14.8205f, 16.1716f, 14.8213f, 16.1732f, 14.8219f, 16.1743f)
                lineTo(14.8232f, 16.1768f)
                lineTo(14.8257f, 16.1781f)
                curveTo(14.8276f, 16.1791f, 14.8309f, 16.1808f, 14.836f, 16.1828f)
                curveTo(14.8577f, 16.1918f, 14.9061f, 16.2071f, 15.0027f, 16.2201f)
                curveTo(15.2134f, 16.2484f, 15.5074f, 16.25f, 16.0f, 16.25f)
                curveTo(16.4926f, 16.25f, 16.7866f, 16.2484f, 16.9973f, 16.2201f)
                curveTo(17.0939f, 16.2071f, 17.1423f, 16.1918f, 17.164f, 16.1828f)
                curveTo(17.1691f, 16.1808f, 17.1724f, 16.1791f, 17.1743f, 16.1781f)
                lineTo(17.1768f, 16.1768f)
                lineTo(17.1781f, 16.1743f)
                curveTo(17.1791f, 16.1724f, 17.1808f, 16.1691f, 17.1828f, 16.164f)
                curveTo(17.1918f, 16.1423f, 17.2071f, 16.0939f, 17.2201f, 15.9973f)
                curveTo(17.2484f, 15.7866f, 17.25f, 15.4926f, 17.25f, 15.0f)
                curveTo(17.25f, 14.5074f, 17.2484f, 14.2134f, 17.2201f, 14.0027f)
                curveTo(17.2071f, 13.9061f, 17.1918f, 13.8577f, 17.1828f, 13.836f)
                curveTo(17.1816f, 13.833f, 17.1806f, 13.8307f, 17.1797f, 13.8288f)
                curveTo(17.1791f, 13.8275f, 17.1786f, 13.8265f, 17.1781f, 13.8257f)
                lineTo(17.1768f, 13.8232f)
                lineTo(17.1743f, 13.8219f)
                curveTo(17.1724f, 13.8209f, 17.1691f, 13.8192f, 17.164f, 13.8172f)
                curveTo(17.1423f, 13.8082f, 17.0939f, 13.7929f, 16.9973f, 13.7799f)
                curveTo(16.7866f, 13.7516f, 16.4926f, 13.75f, 16.0f, 13.75f)
                curveTo(15.5074f, 13.75f, 15.2134f, 13.7516f, 15.0027f, 13.7799f)
                curveTo(14.9061f, 13.7929f, 14.8577f, 13.8082f, 14.836f, 13.8172f)
                curveTo(14.8309f, 13.8192f, 14.8276f, 13.8209f, 14.8257f, 13.8219f)
                close()
                moveTo(5.25f, 13.5f)
                curveTo(5.25f, 13.0858f, 5.5858f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 12.75f, 8.75f, 13.0858f, 8.75f, 13.5f)
                curveTo(8.75f, 13.9142f, 8.4142f, 14.25f, 8.0f, 14.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 14.25f, 5.25f, 13.9142f, 5.25f, 13.5f)
                close()
                moveTo(14.8232f, 16.1768f)
                curveTo(14.823f, 16.1764f, 14.8228f, 16.1764f, 14.8232f, 16.1768f)
                curveTo(14.8237f, 16.1772f, 14.8236f, 16.177f, 14.8232f, 16.1768f)
                close()
                moveTo(17.1768f, 16.1768f)
                curveTo(17.1766f, 16.177f, 17.1767f, 16.1768f, 17.1768f, 16.1768f)
                close()
                moveTo(5.25f, 16.5f)
                curveTo(5.25f, 16.0858f, 5.5858f, 15.75f, 6.0f, 15.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.75f, 10.75f, 16.0858f, 10.75f, 16.5f)
                curveTo(10.75f, 16.9142f, 10.4142f, 17.25f, 10.0f, 17.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 17.25f, 5.25f, 16.9142f, 5.25f, 16.5f)
                close()
            }
        }
            .build()
        return _card2!!
    }

private var _card2: ImageVector? = null
