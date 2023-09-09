package com.chiksmedina.solar.bold.transportpartsservice

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
import com.chiksmedina.solar.bold.TransportPartsServiceGroup

public val TransportPartsServiceGroup.Accumulator: ImageVector
    get() {
        if (_accumulator != null) {
            return _accumulator!!
        }
        _accumulator = Builder(name = "Accumulator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                verticalLineTo(11.9751f)
                curveTo(22.0f, 10.1294f, 22.0f, 9.2066f, 21.6078f, 8.517f)
                curveTo(21.3409f, 8.0477f, 20.9523f, 7.6591f, 20.483f, 7.3922f)
                curveTo(19.7934f, 7.0f, 18.8706f, 7.0f, 17.0249f, 7.0f)
                horizontalLineTo(16.7454f)
                curveTo(16.6224f, 7.0f, 16.561f, 7.0f, 16.5042f, 6.9935f)
                curveTo(16.2083f, 6.9596f, 15.943f, 6.7956f, 15.7803f, 6.5461f)
                curveTo(15.7491f, 6.4983f, 15.7216f, 6.4433f, 15.6667f, 6.3333f)
                curveTo(15.5567f, 6.1135f, 15.5017f, 6.0034f, 15.4394f, 5.9078f)
                curveTo(15.1141f, 5.4088f, 14.5833f, 5.0808f, 13.9915f, 5.013f)
                curveTo(13.8781f, 5.0f, 13.7552f, 5.0f, 13.5093f, 5.0f)
                horizontalLineTo(10.4907f)
                curveTo(10.2448f, 5.0f, 10.1219f, 5.0f, 10.0085f, 5.013f)
                curveTo(9.4167f, 5.0808f, 8.8859f, 5.4088f, 8.5606f, 5.9078f)
                curveTo(8.4983f, 6.0035f, 8.4433f, 6.1134f, 8.3333f, 6.3333f)
                curveTo(8.2784f, 6.4433f, 8.2509f, 6.4983f, 8.2197f, 6.5461f)
                curveTo(8.057f, 6.7956f, 7.7917f, 6.9596f, 7.4958f, 6.9935f)
                curveTo(7.4391f, 7.0f, 7.3776f, 7.0f, 7.2546f, 7.0f)
                horizontalLineTo(6.9751f)
                curveTo(5.1294f, 7.0f, 4.2066f, 7.0f, 3.517f, 7.3922f)
                curveTo(3.0477f, 7.6591f, 2.6591f, 8.0477f, 2.3922f, 8.517f)
                curveTo(2.0f, 9.2066f, 2.0f, 10.1294f, 2.0f, 11.9751f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 16.8284f, 2.0f, 18.2426f, 2.8787f, 19.1213f)
                curveTo(3.7574f, 20.0f, 5.1716f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 20.0f, 20.2426f, 20.0f, 21.1213f, 19.1213f)
                curveTo(22.0f, 18.2426f, 22.0f, 16.8284f, 22.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0448f, 3.25f)
                curveTo(5.4776f, 3.2499f, 5.8744f, 3.2499f, 6.1972f, 3.2933f)
                curveTo(6.5527f, 3.3411f, 6.9284f, 3.4536f, 7.2374f, 3.7626f)
                curveTo(7.5465f, 4.0716f, 7.6589f, 4.4473f, 7.7067f, 4.8028f)
                curveTo(7.7097f, 4.8247f, 7.7124f, 4.8469f, 7.715f, 4.8695f)
                curveTo(7.7487f, 5.1676f, 7.6587f, 5.4639f, 7.5181f, 5.729f)
                curveTo(7.4311f, 5.8931f, 7.2612f, 5.9996f, 7.0755f, 5.9998f)
                lineTo(6.9296f, 6.0f)
                curveTo(6.0455f, 6.0f, 5.3158f, 6.0f, 4.7234f, 6.053f)
                curveTo(4.1073f, 6.1082f, 3.5435f, 6.2267f, 3.0226f, 6.5229f)
                curveTo(2.7418f, 6.6827f, 2.4826f, 6.8751f, 2.25f, 7.0953f)
                lineTo(2.25f, 5.9553f)
                curveTo(2.2499f, 5.5224f, 2.2499f, 5.1256f, 2.2933f, 4.8028f)
                curveTo(2.3411f, 4.4473f, 2.4536f, 4.0716f, 2.7626f, 3.7626f)
                curveTo(3.0716f, 3.4536f, 3.4473f, 3.3411f, 3.8028f, 3.2933f)
                curveTo(4.1256f, 3.2499f, 4.5224f, 3.2499f, 4.9553f, 3.25f)
                horizontalLineTo(5.0448f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0448f, 3.25f)
                curveTo(19.4776f, 3.2499f, 19.8744f, 3.2499f, 20.1972f, 3.2933f)
                curveTo(20.5527f, 3.3411f, 20.9284f, 3.4536f, 21.2374f, 3.7626f)
                curveTo(21.5465f, 4.0716f, 21.6589f, 4.4473f, 21.7067f, 4.8028f)
                curveTo(21.7501f, 5.1256f, 21.7501f, 5.5225f, 21.75f, 5.9553f)
                lineTo(21.75f, 7.0953f)
                curveTo(21.5174f, 6.8751f, 21.2582f, 6.6827f, 20.9774f, 6.5229f)
                curveTo(20.4565f, 6.2267f, 19.8927f, 6.1082f, 19.2766f, 6.053f)
                curveTo(18.6842f, 6.0f, 17.9545f, 6.0f, 17.0704f, 6.0f)
                lineTo(16.9171f, 5.9989f)
                curveTo(16.733f, 5.9976f, 16.5651f, 5.8915f, 16.4796f, 5.7284f)
                curveTo(16.3407f, 5.4636f, 16.2513f, 5.1681f, 16.2849f, 4.871f)
                curveTo(16.2875f, 4.8479f, 16.2903f, 4.8252f, 16.2933f, 4.8028f)
                curveTo(16.3411f, 4.4473f, 16.4535f, 4.0716f, 16.7626f, 3.7626f)
                curveTo(17.0716f, 3.4536f, 17.4473f, 3.3411f, 17.8028f, 3.2933f)
                curveTo(18.1256f, 3.2499f, 18.5224f, 3.2499f, 18.9553f, 3.25f)
                horizontalLineTo(19.0448f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 11.25f)
                curveTo(16.9142f, 11.25f, 17.25f, 11.5858f, 17.25f, 12.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 12.75f, 18.75f, 13.0858f, 18.75f, 13.5f)
                curveTo(18.75f, 13.9142f, 18.4142f, 14.25f, 18.0f, 14.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(15.0f)
                curveTo(17.25f, 15.4142f, 16.9142f, 15.75f, 16.5f, 15.75f)
                curveTo(16.0858f, 15.75f, 15.75f, 15.4142f, 15.75f, 15.0f)
                verticalLineTo(14.25f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 14.25f, 14.25f, 13.9142f, 14.25f, 13.5f)
                curveTo(14.25f, 13.0858f, 14.5858f, 12.75f, 15.0f, 12.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(12.0f)
                curveTo(15.75f, 11.5858f, 16.0858f, 11.25f, 16.5f, 11.25f)
                close()
                moveTo(5.25f, 13.5f)
                curveTo(5.25f, 13.0858f, 5.5858f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 12.75f, 9.75f, 13.0858f, 9.75f, 13.5f)
                curveTo(9.75f, 13.9142f, 9.4142f, 14.25f, 9.0f, 14.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 14.25f, 5.25f, 13.9142f, 5.25f, 13.5f)
                close()
            }
        }
        .build()
        return _accumulator!!
    }

private var _accumulator: ImageVector? = null
