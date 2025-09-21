package dev.chiksmedina.solar.boldduotone.money

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
import dev.chiksmedina.solar.boldduotone.MoneyGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 20.0f, 19.6569f, 20.0f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5581f, 21.9984f, 10.392f, 21.9965f, 10.0f)
                horizontalLineTo(2.0002f)
                curveTo(1.9984f, 10.392f, 2.0f, 11.5581f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.25f, 13.5f)
                curveTo(5.25f, 13.0858f, 5.5858f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 12.75f, 8.75f, 13.0858f, 8.75f, 13.5f)
                curveTo(8.75f, 13.9142f, 8.4142f, 14.25f, 8.0f, 14.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 14.25f, 5.25f, 13.9142f, 5.25f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.25f, 16.5f)
                curveTo(5.25f, 16.0858f, 5.5858f, 15.75f, 6.0f, 15.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.75f, 10.75f, 16.0858f, 10.75f, 16.5f)
                curveTo(10.75f, 16.9142f, 10.4142f, 17.25f, 10.0f, 17.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 17.25f, 5.25f, 16.9142f, 5.25f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.1972f, 12.2933f)
                curveTo(16.8744f, 12.2499f, 16.4776f, 12.25f, 16.0447f, 12.25f)
                horizontalLineTo(15.9553f)
                curveTo(15.5224f, 12.25f, 15.1256f, 12.2499f, 14.8028f, 12.2933f)
                curveTo(14.4473f, 12.3411f, 14.0716f, 12.4535f, 13.7626f, 12.7626f)
                curveTo(13.4535f, 13.0716f, 13.3411f, 13.4473f, 13.2933f, 13.8028f)
                curveTo(13.2499f, 14.1256f, 13.2499f, 14.5224f, 13.25f, 14.9553f)
                lineTo(13.25f, 15.0f)
                lineTo(13.25f, 15.0448f)
                curveTo(13.2499f, 15.4776f, 13.2499f, 15.8744f, 13.2933f, 16.1972f)
                curveTo(13.3411f, 16.5527f, 13.4535f, 16.9284f, 13.7626f, 17.2374f)
                curveTo(14.0716f, 17.5465f, 14.4473f, 17.6589f, 14.8028f, 17.7067f)
                curveTo(15.1256f, 17.7501f, 15.5224f, 17.7501f, 15.9553f, 17.75f)
                lineTo(16.0f, 17.75f)
                lineTo(16.0447f, 17.75f)
                curveTo(16.4776f, 17.7501f, 16.8744f, 17.7501f, 17.1972f, 17.7067f)
                curveTo(17.5527f, 17.6589f, 17.9284f, 17.5465f, 18.2374f, 17.2374f)
                curveTo(18.5465f, 16.9284f, 18.6589f, 16.5527f, 18.7067f, 16.1972f)
                curveTo(18.7501f, 15.8744f, 18.7501f, 15.4776f, 18.75f, 15.0447f)
                verticalLineTo(14.9553f)
                curveTo(18.7501f, 14.5224f, 18.7501f, 14.1256f, 18.7067f, 13.8028f)
                curveTo(18.6589f, 13.4473f, 18.5465f, 13.0716f, 18.2374f, 12.7626f)
                curveTo(17.9284f, 12.4535f, 17.5527f, 12.3411f, 17.1972f, 12.2933f)
                close()
                moveTo(14.8257f, 13.8219f)
                lineTo(14.8233f, 13.8232f)
                lineTo(14.8219f, 13.8257f)
                curveTo(14.8209f, 13.8276f, 14.8192f, 13.8309f, 14.8172f, 13.836f)
                curveTo(14.8082f, 13.8578f, 14.7929f, 13.9061f, 14.7799f, 14.0027f)
                curveTo(14.7516f, 14.2134f, 14.75f, 14.5074f, 14.75f, 15.0f)
                curveTo(14.75f, 15.4926f, 14.7516f, 15.7866f, 14.7799f, 15.9973f)
                curveTo(14.7929f, 16.0939f, 14.8082f, 16.1423f, 14.8172f, 16.164f)
                curveTo(14.8184f, 16.1671f, 14.8195f, 16.1695f, 14.8204f, 16.1714f)
                curveTo(14.821f, 16.1726f, 14.8215f, 16.1736f, 14.8219f, 16.1743f)
                lineTo(14.8232f, 16.1768f)
                lineTo(14.8257f, 16.1781f)
                curveTo(14.8276f, 16.1792f, 14.8309f, 16.1808f, 14.836f, 16.1828f)
                curveTo(14.8577f, 16.1918f, 14.9061f, 16.2071f, 15.0027f, 16.2201f)
                curveTo(15.2134f, 16.2484f, 15.5074f, 16.25f, 16.0f, 16.25f)
                curveTo(16.4926f, 16.25f, 16.7866f, 16.2484f, 16.9973f, 16.2201f)
                curveTo(17.0939f, 16.2071f, 17.1423f, 16.1918f, 17.164f, 16.1828f)
                curveTo(17.1691f, 16.1808f, 17.1724f, 16.1792f, 17.1743f, 16.1781f)
                lineTo(17.1768f, 16.1768f)
                lineTo(17.1781f, 16.1743f)
                curveTo(17.1791f, 16.1724f, 17.1808f, 16.1691f, 17.1828f, 16.164f)
                curveTo(17.1918f, 16.1423f, 17.2071f, 16.0939f, 17.2201f, 15.9973f)
                curveTo(17.2484f, 15.7866f, 17.25f, 15.4926f, 17.25f, 15.0f)
                curveTo(17.25f, 14.5074f, 17.2484f, 14.2134f, 17.2201f, 14.0027f)
                curveTo(17.2071f, 13.9061f, 17.1918f, 13.8578f, 17.1828f, 13.836f)
                curveTo(17.1808f, 13.8309f, 17.1791f, 13.8276f, 17.1781f, 13.8257f)
                lineTo(17.1768f, 13.8232f)
                lineTo(17.1743f, 13.8219f)
                curveTo(17.1724f, 13.8209f, 17.1691f, 13.8192f, 17.164f, 13.8172f)
                curveTo(17.1423f, 13.8082f, 17.0939f, 13.7929f, 16.9973f, 13.7799f)
                curveTo(16.7866f, 13.7516f, 16.4926f, 13.75f, 16.0f, 13.75f)
                curveTo(15.5074f, 13.75f, 15.2134f, 13.7516f, 15.0027f, 13.7799f)
                curveTo(14.9061f, 13.7929f, 14.8577f, 13.8082f, 14.836f, 13.8172f)
                curveTo(14.8309f, 13.8192f, 14.8276f, 13.8209f, 14.8257f, 13.8219f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.9948f, 4.0f)
                horizontalLineTo(14.0052f)
                curveTo(17.7861f, 4.0f, 19.6766f, 4.0f, 20.8512f, 5.1158f)
                curveTo(21.6969f, 5.9192f, 21.9337f, 7.0751f, 22.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                curveTo(2.0663f, 7.0751f, 2.3031f, 5.9192f, 3.1488f, 5.1158f)
                curveTo(4.3234f, 4.0f, 6.2139f, 4.0f, 9.9948f, 4.0f)
                close()
            }
        }
            .build()
        return _card2!!
    }

private var _card2: ImageVector? = null
