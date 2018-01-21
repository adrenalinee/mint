var ac_main =
webpackJsonpac__name_([1],{

/***/ 108:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppState; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

;
var AppState = /** @class */ (function () {
    function AppState() {
        this._state = {};
    }
    Object.defineProperty(AppState.prototype, "state", {
        /**
         * Already return a clone of the current state.
         */
        get: function () {
            return this._state = this._clone(this._state);
        },
        /**
         * Never allow mutation
         */
        set: function (value) {
            throw new Error('do not mutate the `.state` directly');
        },
        enumerable: true,
        configurable: true
    });
    AppState.prototype.get = function (prop) {
        /**
         * Use our state getter for the clone.
         */
        var state = this.state;
        return state.hasOwnProperty(prop) ? state[prop] : state;
    };
    AppState.prototype.set = function (prop, value) {
        /**
         * Internally mutate our state.
         */
        return this._state[prop] = value;
    };
    AppState.prototype._clone = function (object) {
        /**
         * Simple object clone.
         */
        return JSON.parse(JSON.stringify(object));
    };
    AppState = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])()
    ], AppState);
    return AppState;
}());



/***/ }),

/***/ 109:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return BuilderDialogComponent; });
/* unused harmony export ExpanderView */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};


var BuilderDialogComponent = /** @class */ (function () {
    function BuilderDialogComponent(dialog, dialogRef, data) {
        this.dialog = dialog;
        this.dialogRef = dialogRef;
        this.data = data;
    }
    BuilderDialogComponent.prototype.ngOnInit = function () {
        this.expanderView = new ExpanderView();
        this.expanderView.title = this.data.title;
        this.expanderView.expanders = this.data.expanders;
        this.expanderView.selectedExpander = this.data.selectedExpander;
    };
    BuilderDialogComponent.prototype.openBuilder = function () {
        var _this = this;
        var selectedBuilder = this.expanderView.selectedExpander;
        if (selectedBuilder.component == null) {
            console.warn('not registered builder component!!');
            return;
        }
        this.dialog.open(selectedBuilder.component, {
            disableClose: true,
            data: {
                viewModel: selectedBuilder.viewModel
            }
        })
            .afterClosed()
            .subscribe(function (data) {
            if (data != null) {
                selectedBuilder.viewModel = data.viewModel;
                _this.dialogRef.close({
                    value: data.value,
                    selectedExpander: _this.expanderView.selectedExpander
                });
            }
        });
    };
    BuilderDialogComponent.prototype.close = function () {
        this.dialogRef.close();
    };
    BuilderDialogComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-builder-dialog',
            template: __webpack_require__(506),
        }),
        __param(2, __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["d" /* Inject */])(__WEBPACK_IMPORTED_MODULE_1__angular_material__["o" /* MAT_DIALOG_DATA */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["q" /* MatDialog */],
            __WEBPACK_IMPORTED_MODULE_1__angular_material__["p" /* MatDialogRef */], Object])
    ], BuilderDialogComponent);
    return BuilderDialogComponent;
}());

var ExpanderView = /** @class */ (function () {
    function ExpanderView() {
    }
    return ExpanderView;
}());



/***/ }),

/***/ 110:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return SafeHtmlPipe; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TextHtmlViewerComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__(20);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var SafeHtmlPipe = /** @class */ (function () {
    function SafeHtmlPipe(domSanitizer) {
        this.domSanitizer = domSanitizer;
    }
    SafeHtmlPipe.prototype.transform = function (value) {
        var args = [];
        for (var _i = 1; _i < arguments.length; _i++) {
            args[_i - 1] = arguments[_i];
        }
        return this.domSanitizer.bypassSecurityTrustHtml(value);
    };
    SafeHtmlPipe = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["X" /* Pipe */])({
            name: 'safeHtml'
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["f" /* DomSanitizer */]])
    ], SafeHtmlPipe);
    return SafeHtmlPipe;
}());

var TextHtmlViewerComponent = /** @class */ (function () {
    function TextHtmlViewerComponent() {
    }
    TextHtmlViewerComponent.prototype.ngOnInit = function () {
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */])
    ], TextHtmlViewerComponent.prototype, "requestView", void 0);
    TextHtmlViewerComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-text-html-viewer',
            template: __webpack_require__(508),
            styles: [__webpack_require__(636)]
        }),
        __metadata("design:paramtypes", [])
    ], TextHtmlViewerComponent);
    return TextHtmlViewerComponent;
}());



/***/ }),

/***/ 111:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return BodyViewerHostDirective; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpResponseComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__requestExpansions__ = __webpack_require__(167);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__response_body_basic_response_body_basic_component__ = __webpack_require__(168);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_util__ = __webpack_require__(151);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_util___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_util__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var BodyViewerHostDirective = /** @class */ (function () {
    function BodyViewerHostDirective(componentFactoryResolver, viewContainerRef) {
        this.componentFactoryResolver = componentFactoryResolver;
        this.viewContainerRef = viewContainerRef;
    }
    BodyViewerHostDirective.prototype.ngOnInit = function () {
        var componentFactory = this.componentFactoryResolver.resolveComponentFactory(this.bodyViewer.component);
        var componentRef = this.viewContainerRef.createComponent(componentFactory);
        componentRef.instance.requestView = this.requestView;
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__requestExpansions__["a" /* RequestExpander */])
    ], BodyViewerHostDirective.prototype, "bodyViewer", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */])
    ], BodyViewerHostDirective.prototype, "requestView", void 0);
    BodyViewerHostDirective = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["I" /* Directive */])({
            selector: '[body-viewer-host]'
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_0__angular_core__["P" /* ComponentFactoryResolver */],
            __WEBPACK_IMPORTED_MODULE_0__angular_core__["Q" /* ViewContainerRef */]])
    ], BodyViewerHostDirective);
    return BodyViewerHostDirective;
}());

var HttpResponseComponent = /** @class */ (function () {
    function HttpResponseComponent(componentFactoryResolver) {
        this.componentFactoryResolver = componentFactoryResolver;
        this.RequestStatus = __WEBPACK_IMPORTED_MODULE_2__requestViews__["b" /* RequestStatus */];
    }
    HttpResponseComponent.prototype.ngOnInit = function () {
        this.basicResBodyViewer = new __WEBPACK_IMPORTED_MODULE_1__requestExpansions__["a" /* RequestExpander */]('Basic', __WEBPACK_IMPORTED_MODULE_3__response_body_basic_response_body_basic_component__["a" /* ResponseBodyBasicComponent */]);
        this.resBodyVeiwers = this.requestExpansions.map(function (requestExpansion) { return requestExpansion.resBodyVeiwers; });
    };
    /**
     * http response 정보를 입력받아서 화면에 그려준다.
     * http request component가 이 메서드를 호출한다.
     * @param responseInfo
     */
    HttpResponseComponent.prototype.handleResponse = function (responseInfo) {
        var _this = this;
        console.log('handleResponse');
        this.requestView.response = responseInfo;
        this.requestView.requestStatus = __WEBPACK_IMPORTED_MODULE_2__requestViews__["b" /* RequestStatus */].SendSuccess;
        responseInfo.headers
            .filter(function (h) { return h.name.toLocaleLowerCase() === 'content-type'; })
            .forEach(function (h) {
            console.log(h.value);
            if (h.value.startsWith('application/json')) {
                _this.requestView.resDisplayMode = 'json';
                _this.requestView.resContentType = 'application/json';
            }
            else if (h.value.startsWith('application/xml')) {
                _this.requestView.resDisplayMode = 'xml';
                _this.requestView.resContentType = 'application/xml';
            }
            else if (h.value.startsWith('text/xml')) {
                _this.requestView.resDisplayMode = 'xml';
                _this.requestView.resContentType = 'text/xml';
            }
            else if (h.value.startsWith('text/html')) {
                _this.requestView.resDisplayMode = 'html';
                _this.requestView.resContentType = 'text/html';
            }
            else if (h.value.startsWith('text/css')) {
                _this.requestView.resDisplayMode = 'css';
                _this.requestView.resContentType = 'text/css';
            }
        });
        var contentType = this.requestView.resContentType;
        this.matchedResBodyViewers = this.resBodyVeiwers
            .filter(function (viewer) { return !__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_4_util__["isUndefined"])(viewer.get(contentType)); })
            .map(function (viewer) { return viewer.get(contentType); });
        // if (this.matchedResBodyViewers == null) {
        //   this.matchedResBodyViewers = new Array();
        // }
        this.matchedResBodyViewers.splice(0, 0, this.basicResBodyViewer);
        this.selectedBodyViewer = this.matchedResBodyViewers[0];
    };
    /**
     * http request가 실패했을 경우에 대한 처리
     * cors 문제
     * 응답을 받지 못함
     */
    HttpResponseComponent.prototype.handleError = function (err) {
        console.log(err);
        console.log('handleError!');
        this.requestView.requestStatus = __WEBPACK_IMPORTED_MODULE_2__requestViews__["b" /* RequestStatus */].SendFail;
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */])
    ], HttpResponseComponent.prototype, "requestView", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", Array)
    ], HttpResponseComponent.prototype, "requestExpansions", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* ViewChild */])(BodyViewerHostDirective),
        __metadata("design:type", BodyViewerHostDirective)
    ], HttpResponseComponent.prototype, "bodyViewerHost", void 0);
    HttpResponseComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-http-response',
            template: __webpack_require__(514),
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_0__angular_core__["P" /* ComponentFactoryResolver */]])
    ], HttpResponseComponent);
    return HttpResponseComponent;
}());



/***/ }),

/***/ 152:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return decorateModuleRef; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return ENV_PROVIDERS; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(20);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(1);
/**
 * Angular 2
 */


/**
 * Environment Providers
 */
var PROVIDERS = [];
/**
 * Angular debug tools in the dev console
 * https://github.com/angular/angular/blob/86405345b781a9dc2438c0fbe3e9409245647019/TOOLS_JS.md
 */
var _decorateModuleRef = function (value) { return value; };
if (false) {
    enableProdMode();
    /**
     * Production
     */
    _decorateModuleRef = function (modRef) {
        disableDebugTools();
        return modRef;
    };
    PROVIDERS = PROVIDERS.slice();
}
else {
    _decorateModuleRef = function (modRef) {
        var appRef = modRef.injector.get(__WEBPACK_IMPORTED_MODULE_1__angular_core__["a" /* ApplicationRef */]);
        var cmpRef = appRef.components[0];
        var _ng = window.ng;
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* enableDebugTools */])(cmpRef);
        window.ng.probe = _ng.probe;
        window.ng.coreTokens = _ng.coreTokens;
        return modRef;
    };
    /**
     * Development
     */
    PROVIDERS = PROVIDERS.slice();
}
var decorateModuleRef = _decorateModuleRef;
var ENV_PROVIDERS = PROVIDERS.slice();


/***/ }),

/***/ 160:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MultiClientTabComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__mint_client_src_http_client_tab_http_client_tab_component__ = __webpack_require__(166);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MultiClientTabComponent = /** @class */ (function () {
    function MultiClientTabComponent() {
    }
    MultiClientTabComponent.prototype.addClient = function () {
        this.httpClients.addClient();
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* ViewChild */])('httpClients'),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__mint_client_src_http_client_tab_http_client_tab_component__["a" /* HttpClientTabComponent */])
    ], MultiClientTabComponent.prototype, "httpClients", void 0);
    MultiClientTabComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            styles: [
                '.app-action { z-index: 100000; display: inline-block; position: fixed; bottom: 20px; right: 20px; }'
            ],
            template: "\n  <span class=\"app-action\">\n  <button mat-fab\n    matTooltip=\"add Sandbox client\"\n    matTooltipPosition=\"above\"\n    (click)=\"addClient()\"><mat-icon>add</mat-icon></button>\n</span>\n\n<app-http-clients #httpClients></app-http-clients>"
        })
    ], MultiClientTabComponent);
    return MultiClientTabComponent;
}());



/***/ }),

/***/ 161:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SingleClientComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__mint_client_src_requestViews__ = __webpack_require__(25);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SingleClientComponent = /** @class */ (function () {
    function SingleClientComponent() {
    }
    SingleClientComponent.prototype.ngOnInit = function () {
        this.requestView = new __WEBPACK_IMPORTED_MODULE_1__mint_client_src_requestViews__["a" /* RequestView */](null);
        this.requestView.requestUrl = 'http://localhost:3000/assets/test.json';
    };
    SingleClientComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-single-client',
            template: "\n<div style=\"padding: 0.5em 1em 0.5em 1em\">\n    <app-http-client [requestView]=\"requestView\" [requestExpansions]=\"requestExpansions\"></app-http-client>\n</div>\n  "
        }),
        __metadata("design:paramtypes", [])
    ], SingleClientComponent);
    return SingleClientComponent;
}());



/***/ }),

/***/ 162:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DefaultRequestExpansionBuilder; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__requestExpansions__ = __webpack_require__(167);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__authorization_basic_authorization_basic_component__ = __webpack_require__(163);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__xwww_form_urlencoded_xwww_form_urlencoded_component__ = __webpack_require__(165);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__text_plain_text_plain_component__ = __webpack_require__(164);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__text_html_viewer_text_html_viewer_component__ = __webpack_require__(110);





/**
 * 기본적으로 사용할 확장기능 정의 및 전달
 */
var DefaultRequestExpansionBuilder = /** @class */ (function () {
    function DefaultRequestExpansionBuilder() {
    }
    DefaultRequestExpansionBuilder.build = function () {
        var requestExpansion = new __WEBPACK_IMPORTED_MODULE_0__requestExpansions__["b" /* RequestExpansion */]();
        requestExpansion.headerBuilders.set('authorization', new __WEBPACK_IMPORTED_MODULE_0__requestExpansions__["a" /* RequestExpander */]('Basic Auth', __WEBPACK_IMPORTED_MODULE_1__authorization_basic_authorization_basic_component__["a" /* AuthorizationBasicComponent */]));
        requestExpansion.bodyBuilders.set('application/x-www-form-urlencoded', new __WEBPACK_IMPORTED_MODULE_0__requestExpansions__["a" /* RequestExpander */]('Default', __WEBPACK_IMPORTED_MODULE_2__xwww_form_urlencoded_xwww_form_urlencoded_component__["a" /* XWwwFormUrlencodedComponent */]));
        requestExpansion.bodyBuilders.set('text/plain', new __WEBPACK_IMPORTED_MODULE_0__requestExpansions__["a" /* RequestExpander */]('Default', __WEBPACK_IMPORTED_MODULE_3__text_plain_text_plain_component__["a" /* TextPlainComponent */]));
        requestExpansion.resBodyVeiwers.set('text/html', new __WEBPACK_IMPORTED_MODULE_0__requestExpansions__["a" /* RequestExpander */]('HTML View', __WEBPACK_IMPORTED_MODULE_4__text_html_viewer_text_html_viewer_component__["a" /* TextHtmlViewerComponent */]));
        var requestExpansions = new Array();
        requestExpansions.push(requestExpansion);
        return requestExpansions;
    };
    return DefaultRequestExpansionBuilder;
}());



/***/ }),

/***/ 163:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AuthorizationBasicComponent; });
/* unused harmony export BasicAuthView */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};


var AuthorizationBasicComponent = /** @class */ (function () {
    function AuthorizationBasicComponent(dialogRef, data) {
        this.dialogRef = dialogRef;
        this.data = data;
    }
    AuthorizationBasicComponent.prototype.ngOnInit = function () {
        this.basicAuthView = this.data.viewModel;
        if (this.basicAuthView == null) {
            this.basicAuthView = new BasicAuthView();
        }
    };
    AuthorizationBasicComponent.prototype.apply = function () {
        var authorization = 'Basic ' + btoa(this.basicAuthView.username + ':' + this.basicAuthView.password);
        this.dialogRef.close({
            value: authorization,
            viewModel: this.basicAuthView
        });
    };
    AuthorizationBasicComponent.prototype.close = function () {
        this.dialogRef.close();
    };
    AuthorizationBasicComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-authorization-basic',
            template: __webpack_require__(507),
            styles: [__webpack_require__(635)]
        }),
        __param(1, __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["d" /* Inject */])(__WEBPACK_IMPORTED_MODULE_1__angular_material__["o" /* MAT_DIALOG_DATA */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["p" /* MatDialogRef */], Object])
    ], AuthorizationBasicComponent);
    return AuthorizationBasicComponent;
}());

var BasicAuthView = /** @class */ (function () {
    function BasicAuthView() {
    }
    return BasicAuthView;
}());



/***/ }),

/***/ 164:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TextPlainComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};



var TextPlainComponent = /** @class */ (function () {
    function TextPlainComponent(dialogRef, data) {
        this.dialogRef = dialogRef;
        this.data = data;
        this.formDatas = this.data.viewModel;
    }
    TextPlainComponent.prototype.ngOnInit = function () {
        if (this.formDatas == null) {
            this.formDatas = new Array();
            this.formDatas.push(new __WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */]());
        }
    };
    TextPlainComponent.prototype.apply = function () {
        var textPlainFormData = this.formDatas
            .filter(function (p) { return p.name != null || p.value != null; })
            .map(function (p) { return p.name + '=' + p.value; })
            .join('\n');
        this.dialogRef.close({
            value: textPlainFormData,
            viewModel: this.formDatas
        });
    };
    TextPlainComponent.prototype.close = function () {
        this.dialogRef.close();
    };
    TextPlainComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-text-plain',
            template: __webpack_require__(509),
            styles: [__webpack_require__(637)]
        }),
        __param(1, __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["d" /* Inject */])(__WEBPACK_IMPORTED_MODULE_1__angular_material__["o" /* MAT_DIALOG_DATA */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["p" /* MatDialogRef */], Object])
    ], TextPlainComponent);
    return TextPlainComponent;
}());



/***/ }),

/***/ 165:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return XWwwFormUrlencodedComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var __param = (this && this.__param) || function (paramIndex, decorator) {
    return function (target, key) { decorator(target, key, paramIndex); }
};



var XWwwFormUrlencodedComponent = /** @class */ (function () {
    function XWwwFormUrlencodedComponent(dialogRef, data) {
        this.dialogRef = dialogRef;
        this.data = data;
        this.formDatas = this.data.viewModel;
    }
    XWwwFormUrlencodedComponent.prototype.ngOnInit = function () {
        if (this.formDatas == null) {
            this.formDatas = new Array();
            this.formDatas.push(new __WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */]());
        }
    };
    XWwwFormUrlencodedComponent.prototype.apply = function () {
        var urlEncodedFormData = this.formDatas
            .filter(function (p) { return !p.isEmpty(); })
            .map(function (p) { return encodeURI(p.name) + '=' + encodeURI(p.value); })
            .join('&');
        this.dialogRef.close({
            value: urlEncodedFormData,
            viewModel: this.formDatas
        });
    };
    XWwwFormUrlencodedComponent.prototype.close = function () {
        this.dialogRef.close();
    };
    XWwwFormUrlencodedComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-xwww-form-urlencoded',
            template: __webpack_require__(510),
            styles: [__webpack_require__(638)]
        }),
        __param(1, __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["d" /* Inject */])(__WEBPACK_IMPORTED_MODULE_1__angular_material__["o" /* MAT_DIALOG_DATA */])),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["p" /* MatDialogRef */], Object])
    ], XWwwFormUrlencodedComponent);
    return XWwwFormUrlencodedComponent;
}());



/***/ }),

/***/ 166:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpClientTabComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__expansions_DefaultRequestExpansionBuilder__ = __webpack_require__(162);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__httpClientsPreference__ = __webpack_require__(324);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var HttpClientTabComponent = /** @class */ (function () {
    function HttpClientTabComponent(// private httpClientExpansionService: HttpClientExpansionService,
        snackBar) {
        this.snackBar = snackBar;
        this.requestViews = new Array();
        /**
         * 탭 생성할때 부여할 번호. 이름을 구분하기 위해 사용
         */
        this.tabCount = 1;
        /**
         * 현재 포커스를 가지고 있는 탭의 인덱스
         */
        this.selectedIndex = 0;
    }
    /**
     *
     */
    HttpClientTabComponent.prototype.ngOnInit = function () {
        if (this.preference == null) {
            // TODO 기본 설정을 사용
            this.preference = new __WEBPACK_IMPORTED_MODULE_4__httpClientsPreference__["a" /* HttpClientsPreference */]();
            // this.preference.addAllDefaultStatus();
        }
        if (this.requestExpansions == null) {
            // this.requestExpansions = new Array(); //TODO 입력받은 값이 없을 경우 기본 확장 셋이 등록되어야 한다.
            this.requestExpansions = __WEBPACK_IMPORTED_MODULE_3__expansions_DefaultRequestExpansionBuilder__["a" /* DefaultRequestExpansionBuilder */].build();
        }
        this.addClient();
        // const requestView: RequestView = new RequestView("SandBox-" + this.tabCount++);
        // this.requestViews.push(requestView);
        // TODO 아래 내용들은 http-clients 밖에서 정의된후 넘어와야 한다.
        // const requestExpansion = new RequestExpansion();
        // requestExpansion.headerBuilders.add('authorization', {
        //   name: 'Basic Auth',
        //   component: AuthorizationBasicComponent
        // });
        // requestExpansion.queryParamBuilders.add('test', {
        //   name: 'test',
        //   component: AuthorizationBasicComponent
        // });
        // requestExpansion.urlParamBuilders.add('test', {
        //   name: 'test',
        //   component: AuthorizationBasicComponent
        // });
        // requestExpansion.bodyBuilders.add('application/x-www-form-urlencoded', {
        //   name: 'Default',
        //   component: XWwwFormUrlencodedComponent
        // });
        // requestExpansion.bodyBuilders.add('text/plain', {
        //   name: 'Default',
        //   component: TextPlainComponent
        // });
        // requestExpansion.resBodyVeiwers.add('text/html', {
        //   name: 'HTML View',
        //   component: TextHtmlViewerComponent
        // });
        // this.requestExpansions.push(requestExpansion);
    };
    /**
     * 클라이언트 탭 추가
     *
     * @param focus 추가된 탭이 포커스를 가지게 할지 여부
     * @param position 추가될 탭의 위치, 지정하지 않으면 마지막에 추가됨
     * @param config
     */
    HttpClientTabComponent.prototype.addClient = function (focus, position, config) {
        if (focus === void 0) { focus = true; }
        console.log('addClient');
        if (!this.isAvailableAddTab()) {
            return;
        }
        // TODO config 처리..
        var requestView = new __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */]('SandBox-' + this.tabCount++);
        var addedIndex = this.requestViews.push(requestView);
        if (focus) {
            this.selectedIndex = addedIndex;
        }
    };
    /**
     * 클라이언트 탭 닫기
     * @param index
     */
    HttpClientTabComponent.prototype.closeClient = function (index) {
        this.requestViews.splice(index, 1);
    };
    /**
     * 탭 복제
     * 입력 받은 인덱스의 탭과 같은 요청 정보가 셋팅된 클라이언트 탭을 추가
     * @param index
     */
    HttpClientTabComponent.prototype.duplicateClient = function (index) {
        if (!this.isAvailableAddTab()) {
            return;
        }
        var requestView = this.requestViews[index];
        var newRequestView = new __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */]('SandBox-' + this.tabCount++);
        newRequestView.requestUrl = requestView.requestUrl;
        // TODO 필요한 정보를 모두 복사
        this.requestViews.splice(index + 1, 0, newRequestView);
    };
    /**
     * 클라이언트 탭 을 추가로 생성할 수 있는지 알려준다.
     */
    HttpClientTabComponent.prototype.isAvailableAddTab = function () {
        if (this.requestViews.length >= this.preference.maxClientTabCount) {
            this.snackBar.open('You can not create tabs any more .', null, {
                duration: 3000
            });
            return false;
        }
        else {
            return true;
        }
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_4__httpClientsPreference__["a" /* HttpClientsPreference */])
    ], HttpClientTabComponent.prototype, "preference", void 0);
    HttpClientTabComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-http-clients',
            template: __webpack_require__(511),
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["n" /* MatSnackBar */]])
    ], HttpClientTabComponent);
    return HttpClientTabComponent;
}());



/***/ }),

/***/ 167:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return RequestExpansion; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RequestExpander; });
/**
 * http client 에 확장 포인트를 정의
 * 여기서 말하는 확장이라함은 http request의 구성 요소를 그냥 text로 작성하는 방식이 아닌
 * 좀더 쉬운 방법(UI 기반)을 제공해주는 역할과 response 데이터도 단순히 text가 아닌 정형화된 형태로
 * 보여줄수 있는 방법을 말한다.
 * 확장은 http request 의 구성요소중 지정된 요소에 대해서 가능하며 하나의 http request 에
 * 여러거의 확장 객체를 가질 수 있다.
 */
var RequestExpansion = /** @class */ (function () {
    function RequestExpansion() {
        /**
         * header 값을 생성해주는 빌더
         */
        this.headerBuilders = new Map();
        /**
         * url parameter 값을 생성해주는 빌더
         */
        this.urlParamBuilders = new Map();
        /**
         * query string paramter 값을 생성해주는 빌더
         */
        this.queryParamBuilders = new Map();
        /**
         * request body 를 생성해주는 빌더
         */
        this.bodyBuilders = new Map();
        /**
         * response body 를 보여주는 뷰어
         */
        this.resBodyVeiwers = new Map();
    }
    return RequestExpansion;
}());

var RequestExpander = /** @class */ (function () {
    function RequestExpander(name, component, componentRef, viewModel) {
        this.name = name;
        this.component = component;
        this.componentRef = componentRef;
        this.viewModel = viewModel;
    }
    return RequestExpander;
}());



/***/ }),

/***/ 168:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ResponseBodyBasicComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__requestViews__ = __webpack_require__(25);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ResponseBodyBasicComponent = /** @class */ (function () {
    // aceOption: any;
    function ResponseBodyBasicComponent() {
    }
    ResponseBodyBasicComponent.prototype.ngOnInit = function () {
        // console.log('ngOnInit');
        // this.aceOption = {
        //   minLines: 10,
        //   maxLines: '1000',
        //   showPrintMargin: false,
        //   wrap: this.requestView.resBodyWrap
        // }
        this.displayModes = [
            'text',
            'json',
            'xml',
            'html',
            'css',
            'javascript'
        ];
        this.displayResBody = this.requestView.response.body;
    };
    ResponseBodyBasicComponent.prototype.onChangeFormat = function () {
        console.log('onChangeFormat');
        var resBodyFormat = this.requestView.resBodyFormat;
        // console.log(resBodyFormat);
        // console.log(this.requestView.resContentType);
        if (!resBodyFormat) {
            this.displayResBody = this.requestView.response.body;
        }
        else {
            if (this.requestView.resContentType === 'application/json') {
                this.displayResBody = this.formatJson(this.requestView.response.body);
            }
            else if (this.requestView.resContentType === 'application/xml' ||
                this.requestView.resContentType === 'text/xml') {
                this.displayResBody = this.formatXml(this.requestView.response.body);
            }
            else {
                // TODO notify unsupported format
                console.warn('unsupported format. content type: ' + this.requestView.resContentType);
            }
        }
    };
    ResponseBodyBasicComponent.prototype.formatJson = function (json) {
        return JSON.stringify(JSON.parse(json), null, 2);
    };
    /**
     *
     * @param xml 원본 xml 문자
     */
    ResponseBodyBasicComponent.prototype.formatXml = function (xml) {
        var formatted = '';
        var reg = /(>)(<)(\/*)/g;
        xml = xml.replace(reg, '$1\r\n$2$3');
        var pad = 0;
        xml.split('\r\n').forEach(function (node) {
            var indent = 0;
            if (node.match(/.+<\/\w[^>]*>$/)) {
                indent = 0;
            }
            else if (node.match(/^<\/\w/)) {
                if (pad !== 0) {
                    pad -= 1;
                }
            }
            else if (node.match(/^<\w[^>]*[^\/]>.*$/)) {
                indent = 1;
            }
            else {
                indent = 0;
            }
            var padding = '';
            for (var i = 0; i < pad; i++) {
                padding += '  ';
            }
            formatted += padding + node + '\r\n';
            pad += indent;
        });
        return formatted;
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__requestViews__["a" /* RequestView */])
    ], ResponseBodyBasicComponent.prototype, "requestView", void 0);
    ResponseBodyBasicComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-response-body-basic',
            template: __webpack_require__(517),
            styles: [__webpack_require__(640)]
        }),
        __metadata("design:paramtypes", [])
    ], ResponseBodyBasicComponent);
    return ResponseBodyBasicComponent;
}());



/***/ }),

/***/ 169:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MyLibService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var MyLibService = /** @class */ (function () {
    function MyLibService() {
        this.myLib = 'Angular Library Starter';
    }
    MyLibService = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])()
    ], MyLibService);
    return MyLibService;
}());



/***/ }),

/***/ 25:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RequestView; });
/* unused harmony export RequestInfo */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "d", function() { return ResponseInfo; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "c", function() { return NameValue; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return RequestStatus; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_util__ = __webpack_require__(151);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0_util___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_0_util__);
// import { RequestExpander } from 'app/requestExpansion';

/**
 * 하나의 request를 화면에 그리기 위한 모든 데이터 저장
 * http client component 에서 사용
 */
var RequestView = /** @class */ (function () {
    function RequestView(title) {
        /**
         * request body의 content type
         * 요청 해더에 입력한 content type을 이 필드에 따로 저장합니다.
         * 요청 바디의 syntax highlight 처리를 위해 이값을 따로 관리함
         */
        this.reqContentType = '';
        /**
         * 요청 바디를 화면에 표시할 방법
         * ace editor 에 의존적인 값으로 요청 바디를 그리는 ace editor의 syntax highlight를 지정하는 값이다.
         * 참조: https://ace.c9.io/build/kitchen-sink.html (모드 종류)
         */
        this.reqDisplayMode = 'text';
        // reqSyntaxHightlight: boolean = false;
        // headerBuilders: Array<NameValue> = new Array();
        this.requestStatus = RequestStatus.PreSend;
        // isOpenResponse: boolean;
        this.resContentType = '';
        this.resDisplayMode = 'text';
        this.resBodyWrap = true;
        this.resBodyFormat = false;
        this.request = new RequestInfo();
        this.response = new ResponseInfo();
        this.title = title;
    }
    return RequestView;
}());

var RequestInfo = /** @class */ (function () {
    function RequestInfo() {
        this.method = 'GET';
        this.queryParams = [new NameValue()];
        this.urlParams = [new NameValue()];
        this.headers = [new NameValue()];
    }
    return RequestInfo;
}());

var ResponseInfo = /** @class */ (function () {
    function ResponseInfo() {
        this.headers = [];
    }
    return ResponseInfo;
}());

var NameValue = /** @class */ (function () {
    function NameValue(name, value) {
        this.enabled = true;
        this.name = __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0_util__["isUndefined"])(name) ? '' : name;
        this.value = __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0_util__["isUndefined"])(value) ? '' : value;
    }
    NameValue.new = function (name, value) {
        var nameValue = new NameValue();
        nameValue.name = __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0_util__["isNull"])(name) ? '' : name;
        nameValue.value = __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0_util__["isNull"])(value) ? '' : value;
        return nameValue;
    };
    NameValue.prototype.isEmpty = function () {
        return this.name === '' && this.value === '';
    };
    return NameValue;
}());

var RequestStatus;
(function (RequestStatus) {
    /**
     * 초기 상태. 요청을 하지 않은 상태
     */
    RequestStatus[RequestStatus["PreSend"] = 0] = "PreSend";
    /**
     * 요청중. 아직 응답은 받지 못한 상태
     */
    RequestStatus[RequestStatus["Sending"] = 1] = "Sending";
    /**
     * 요청 성공. 서버에서 응답을 받은 상태
     */
    RequestStatus[RequestStatus["SendSuccess"] = 2] = "SendSuccess";
    /**
     * 요청 실패. 서버에서 응답을 받지 못함
     * (서버 무응답(time out..), 인터넷 불가등..)
     */
    RequestStatus[RequestStatus["SendFail"] = 3] = "SendFail";
})(RequestStatus || (RequestStatus = {}));


/***/ }),

/***/ 256:
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	return new Promise(function(resolve, reject) { reject(new Error("Cannot find module '" + req + "'.")); });
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = 256;

/***/ }),

/***/ 258:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__app_module__ = __webpack_require__(309);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "a", function() { return __WEBPACK_IMPORTED_MODULE_0__app_module__["a"]; });
/**
 * App
 */



/***/ }),

/***/ 308:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__app_service__ = __webpack_require__(108);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
/**
 * Angular 2 decorators and services
 */


/**
 * App Component
 * Top Level Component
 */
var AppComponent = /** @class */ (function () {
    function AppComponent(appState) {
        this.appState = appState;
        this.angularclassLogo = 'assets/img/angularclass-avatar.png';
        this.name = 'Angular 2 Webpack Starter';
        this.url = 'https://twitter.com/AngularClass';
    }
    AppComponent.prototype.ngOnInit = function () {
        console.log('Initial App State', this.appState.state);
    };
    AppComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-root',
            encapsulation: __WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* ViewEncapsulation */].None,
            styles: [
                __webpack_require__(633)
            ],
            template: "\n<app-header></app-header>\n\n<div class=\"content-container content\">\n    <router-outlet></router-outlet>\n</div>"
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__app_service__["a" /* AppState */]])
    ], AppComponent);
    return AppComponent;
}());

/**
 * Please review the https://github.com/AngularClass/angular2-examples/ repo for
 * more angular app examples that you may copy/paste
 * (The examples may not be updated as quickly. Please open an issue on github for us to update it)
 * For help or questions please contact us at @AngularClass on twitter
 * or our chat on Slack at https://AngularClass.com/slack-join
 */


/***/ }),

/***/ 309:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(20);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_animations__ = __webpack_require__(306);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__(29);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angularclass_hmr__ = __webpack_require__(333);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angularclass_hmr___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4__angularclass_hmr__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_router__ = __webpack_require__(307);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__environment__ = __webpack_require__(152);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__app_routes__ = __webpack_require__(311);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__app_component__ = __webpack_require__(308);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__app_resolver__ = __webpack_require__(310);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__app_service__ = __webpack_require__(108);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__home__ = __webpack_require__(315);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__no_content__ = __webpack_require__(316);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__styles_styles_scss__ = __webpack_require__(629);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__styles_styles_scss___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_13__styles_styles_scss__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__styles_headings_css__ = __webpack_require__(630);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__styles_headings_css___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_14__styles_headings_css__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15_my_lib__ = __webpack_require__(329);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16_mint_client__ = __webpack_require__(325);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__detail_detail_component__ = __webpack_require__(313);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__angular_common_http__ = __webpack_require__(154);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__single_client_single_client_component__ = __webpack_require__(161);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__multi_client_multi_client_tab_component__ = __webpack_require__(160);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__components_header_component__ = __webpack_require__(312);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__angular_flex_layout__ = __webpack_require__(155);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






/*
 * Platform and Environment providers/directives/pipes
 */


// App is our top level component







// Application wide providers
var APP_PROVIDERS = __WEBPACK_IMPORTED_MODULE_9__app_resolver__["a" /* APP_RESOLVER_PROVIDERS */].concat([
    __WEBPACK_IMPORTED_MODULE_10__app_service__["a" /* AppState */]
]);


// import { MintClientModule } from '../../mintClient/src/mint-client.module';







/**
 * `AppModule` is the main entry point into Angular2's bootstraping process
 */
var AppModule = /** @class */ (function () {
    function AppModule(appRef, appState) {
        this.appRef = appRef;
        this.appState = appState;
    }
    AppModule.prototype.hmrOnInit = function (store) {
        if (!store || !store.state) {
            return;
        }
        console.log('HMR store', JSON.stringify(store, null, 2));
        /**
         * Set state
         */
        this.appState._state = store.state;
        /**
         * Set input values
         */
        if ('restoreInputValues' in store) {
            var restoreInputValues = store.restoreInputValues;
            setTimeout(restoreInputValues);
        }
        this.appRef.tick();
        delete store.state;
        delete store.restoreInputValues;
    };
    AppModule.prototype.hmrOnDestroy = function (store) {
        var cmpLocation = this.appRef.components.map(function (cmp) { return cmp.location.nativeElement; });
        /**
         * Save state
         */
        var state = this.appState._state;
        store.state = state;
        /**
         * Recreate root elements
         */
        store.disposeOldHosts = __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_4__angularclass_hmr__["createNewHosts"])(cmpLocation);
        /**
         * Save input values
         */
        store.restoreInputValues = __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_4__angularclass_hmr__["createInputTransfer"])();
        /**
         * Remove styles
         */
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_4__angularclass_hmr__["removeNgStyles"])();
    };
    AppModule.prototype.hmrAfterDestroy = function (store) {
        /**
         * Display new elements
         */
        store.disposeOldHosts();
        delete store.disposeOldHosts;
    };
    AppModule = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_3__angular_core__["y" /* NgModule */])({
            bootstrap: [__WEBPACK_IMPORTED_MODULE_8__app_component__["a" /* AppComponent */]],
            declarations: [
                __WEBPACK_IMPORTED_MODULE_8__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_11__home__["a" /* HomeComponent */],
                __WEBPACK_IMPORTED_MODULE_17__detail_detail_component__["a" /* DetailComponent */],
                __WEBPACK_IMPORTED_MODULE_12__no_content__["a" /* NoContentComponent */],
                __WEBPACK_IMPORTED_MODULE_21__components_header_component__["a" /* HeaderComponent */],
                __WEBPACK_IMPORTED_MODULE_19__single_client_single_client_component__["a" /* SingleClientComponent */],
                __WEBPACK_IMPORTED_MODULE_20__multi_client_multi_client_tab_component__["a" /* MultiClientTabComponent */]
            ],
            /**
             * Import Angular's modules.
             */
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_animations__["a" /* BrowserAnimationsModule */],
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["b" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_23__angular_flex_layout__["a" /* FlexLayoutModule */],
                __WEBPACK_IMPORTED_MODULE_18__angular_common_http__["a" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_15_my_lib__["a" /* MyLibModule */],
                __WEBPACK_IMPORTED_MODULE_22__angular_material__["a" /* MatButtonModule */],
                __WEBPACK_IMPORTED_MODULE_22__angular_material__["b" /* MatIconModule */],
                __WEBPACK_IMPORTED_MODULE_22__angular_material__["c" /* MatMenuModule */],
                __WEBPACK_IMPORTED_MODULE_22__angular_material__["d" /* MatToolbarModule */],
                __WEBPACK_IMPORTED_MODULE_22__angular_material__["e" /* MatTabsModule */],
                __WEBPACK_IMPORTED_MODULE_16_mint_client__["a" /* MintClientModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_router__["a" /* RouterModule */].forRoot(__WEBPACK_IMPORTED_MODULE_7__app_routes__["a" /* ROUTES */], { useHash: true, preloadingStrategy: __WEBPACK_IMPORTED_MODULE_5__angular_router__["b" /* PreloadAllModules */] })
            ],
            /**
             * Expose our Services and Providers into Angular's dependency injection.
             */
            providers: [
                __WEBPACK_IMPORTED_MODULE_6__environment__["b" /* ENV_PROVIDERS */],
                APP_PROVIDERS
            ]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__angular_core__["a" /* ApplicationRef */],
            __WEBPACK_IMPORTED_MODULE_10__app_service__["a" /* AppState */]])
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ 310:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export DataResolver */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return APP_RESOLVER_PROVIDERS; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_Observable__ = __webpack_require__(11);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_Observable___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_rxjs_Observable__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_observable_of__ = __webpack_require__(522);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_observable_of___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_observable_of__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



var DataResolver = /** @class */ (function () {
    function DataResolver() {
    }
    DataResolver.prototype.resolve = function (route, state) {
        return __WEBPACK_IMPORTED_MODULE_1_rxjs_Observable__["Observable"].of({ res: 'I am data' });
    };
    DataResolver = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])()
    ], DataResolver);
    return DataResolver;
}());

/**
 * An array of services to resolve routes with data.
 */
var APP_RESOLVER_PROVIDERS = [
    DataResolver
];


/***/ }),

/***/ 311:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ROUTES; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__single_client_single_client_component__ = __webpack_require__(161);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__multi_client_multi_client_tab_component__ = __webpack_require__(160);


var ROUTES = [
    // { path: '',      component: HomeComponent },
    { path: '', redirectTo: '/client', pathMatch: 'full' },
    // { path: 'home',  component: HomeComponent },
    // { path: 'detail',  component: DetailComponent },
    { path: 'clients', component: __WEBPACK_IMPORTED_MODULE_1__multi_client_multi_client_tab_component__["a" /* MultiClientTabComponent */] },
    { path: 'client', component: __WEBPACK_IMPORTED_MODULE_0__single_client_single_client_component__["a" /* SingleClientComponent */] },
];


/***/ }),

/***/ 312:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HeaderComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var HeaderComponent = /** @class */ (function () {
    function HeaderComponent() {
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-header',
            template: "\n<mat-toolbar color=\"primary\">\n    <span>Mint Sample App</span>\n    <button mat-button routerLink=\"/client\">single client</button>\n    <button mat-button routerLink=\"/clients\">multi client</button>\n    <span fxFlex></span>\n    <button mat-icon-button mdTooltip=\"Help\">\n        <mat-icon>help</mat-icon>\n    </button>\n</mat-toolbar>\n  "
        }),
        __metadata("design:paramtypes", [])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ 313:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DetailComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var DetailComponent = /** @class */ (function () {
    function DetailComponent() {
    }
    DetailComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-detail',
            template: "\n   <app-http-client></app-http-client> \n  "
        })
    ], DetailComponent);
    return DetailComponent;
}());



/***/ }),

/***/ 314:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HomeComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__app_service__ = __webpack_require__(108);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var HomeComponent = /** @class */ (function () {
    /**
     * TypeScript public modifiers
     */
    function HomeComponent(appState) {
        this.appState = appState;
        /**
         * Set our default values
         */
        this.localState = { value: '' };
    }
    HomeComponent.prototype.ngOnInit = function () {
        console.log('hello `Home` component');
        /**
         * this.title.getData().subscribe(data => this.data = data);
         */
    };
    HomeComponent.prototype.submitState = function (value) {
        console.log('submitState', value);
        this.appState.set('value', value);
        this.localState.value = '';
    };
    HomeComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-home',
            /**
             * Our list of styles in our component. We may add more to compose many styles together.
             */
            styles: [__webpack_require__(634)],
            /**
             * Every Angular template is first compiled by the browser before Angular runs it's compiler.
             */
            template: __webpack_require__(505)
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__app_service__["a" /* AppState */]])
    ], HomeComponent);
    return HomeComponent;
}());



/***/ }),

/***/ 315:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__home_component__ = __webpack_require__(314);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "a", function() { return __WEBPACK_IMPORTED_MODULE_0__home_component__["a"]; });



/***/ }),

/***/ 316:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__no_content_component__ = __webpack_require__(317);
/* harmony namespace reexport (by used) */ __webpack_require__.d(__webpack_exports__, "a", function() { return __WEBPACK_IMPORTED_MODULE_0__no_content_component__["a"]; });



/***/ }),

/***/ 317:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NoContentComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var NoContentComponent = /** @class */ (function () {
    function NoContentComponent() {
    }
    NoContentComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-no-content',
            template: "\n    <div>\n      <h1>404: page missing</h1>\n    </div>\n  "
        })
    ], NoContentComponent);
    return NoContentComponent;
}());



/***/ }),

/***/ 318:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony export (immutable) */ __webpack_exports__["main"] = main;
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser_dynamic__ = __webpack_require__(257);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__app_environment__ = __webpack_require__(152);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app__ = __webpack_require__(258);
/**
 * Angular bootstrapping
 */


/**
 * App Module
 * our top level module that holds all of our components
 */

/**
 * Bootstrap our Angular app with a top level NgModule
 */
function main() {
    return __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])()
        .bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app__["a" /* AppModule */]).then(function(MODULE_REF) {
  if (false) {
    module["hot"]["accept"]();
    
    if (MODULE_REF.instance["hmrOnInit"]) {
      module["hot"]["data"] && MODULE_REF.instance["hmrOnInit"](module["hot"]["data"]);
    }
    if (MODULE_REF.instance["hmrOnStatus"]) {
      module["hot"]["apply"](function(status) {
        MODULE_REF.instance["hmrOnStatus"](status);
      });
    }
    if (MODULE_REF.instance["hmrOnCheck"]) {
      module["hot"]["check"](function(err, outdatedModules) {
        MODULE_REF.instance["hmrOnCheck"](err, outdatedModules);
      });
    }
    if (MODULE_REF.instance["hmrOnDecline"]) {
      module["hot"]["decline"](function(dependencies) {
        MODULE_REF.instance["hmrOnDecline"](dependencies);
      });
    }
    module["hot"]["dispose"](function(store) {
      MODULE_REF.instance["hmrOnDestroy"] && MODULE_REF.instance["hmrOnDestroy"](store);
      MODULE_REF.destroy();
      MODULE_REF.instance["hmrAfterDestroy"] && MODULE_REF.instance["hmrAfterDestroy"](store);
    });
  }
  return MODULE_REF;
})
        .then(__WEBPACK_IMPORTED_MODULE_1__app_environment__["a" /* decorateModuleRef */])
        .catch(function (err) { return console.error(err); });
}
/**
 * Needed for hmr
 * in prod this is replace for document ready
 */
switch (document.readyState) {
    case 'loading':
        document.addEventListener('DOMContentLoaded', _domReadyHandler, false);
        break;
    case 'interactive':
    case 'complete':
    default:
        main();
}
function _domReadyHandler() {
    document.removeEventListener('DOMContentLoaded', _domReadyHandler, false);
    main();
}


/***/ }),

/***/ 320:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpClientService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_add_operator_map__ = __webpack_require__(523);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_common_http__ = __webpack_require__(154);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var HttpClientService = /** @class */ (function () {
    function HttpClientService(http) {
        this.http = http;
    }
    HttpClientService.prototype.execute2 = function (method, url, requestHeaders, body) {
        var headers = new __WEBPACK_IMPORTED_MODULE_3__angular_common_http__["b" /* HttpHeaders */]();
        requestHeaders
            .filter(function (nameValue) { return !nameValue.isEmpty(); })
            .forEach(function (nameValue) {
            headers.set(nameValue.name, nameValue.value);
        });
        var startTime = new Date().getTime();
        return this.http.request(method, url, {
            body: body,
            headers: headers,
            observe: 'response',
            responseType: 'text'
        }).map(function (response) {
            console.log(response);
            var elapseTime = new Date().getTime() - startTime;
            var responseInfo = new __WEBPACK_IMPORTED_MODULE_2__requestViews__["d" /* ResponseInfo */]();
            responseInfo.status = response.status;
            responseInfo.statusText = response.statusText;
            responseInfo.elapseTime = elapseTime;
            response.headers.keys()
                .forEach(function (k) {
                responseInfo.headers.push(__WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */].new(k, response.headers.get(k)));
            });
            responseInfo.body = response.body == null ? '' : response.body;
            return responseInfo;
        }); // .catch(this.handleError);
    };
    HttpClientService = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["c" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__angular_common_http__["c" /* HttpClient */]])
    ], HttpClientService);
    return HttpClientService;
}());



/***/ }),

/***/ 321:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpClientComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__httpClientConfig__ = __webpack_require__(323);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__http_response_http_response_component__ = __webpack_require__(111);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__expansions_DefaultRequestExpansionBuilder__ = __webpack_require__(162);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var HttpClientComponent = /** @class */ (function () {
    function HttpClientComponent() {
    }
    HttpClientComponent.prototype.ngOnInit = function () {
        // console.log(this.httpResponse);
        if (this.config == null) {
            this.config = new __WEBPACK_IMPORTED_MODULE_1__httpClientConfig__["a" /* HttpClientConfig */]();
        }
        if (this.requestView == null) {
            this.requestView = new __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */]();
        }
        if (this.requestExpansions == null) {
            // this.requestExpansions = new Array(); //TODO 입력받은 값이 없을 경우 기본 확장 셋이 등록되어야 한다.
            this.requestExpansions = __WEBPACK_IMPORTED_MODULE_4__expansions_DefaultRequestExpansionBuilder__["a" /* DefaultRequestExpansionBuilder */].build();
        }
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_1__httpClientConfig__["a" /* HttpClientConfig */])
    ], HttpClientComponent.prototype, "config", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */])
    ], HttpClientComponent.prototype, "requestView", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", Array)
    ], HttpClientComponent.prototype, "requestExpansions", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* ViewChild */])(__WEBPACK_IMPORTED_MODULE_3__http_response_http_response_component__["a" /* HttpResponseComponent */]),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_3__http_response_http_response_component__["a" /* HttpResponseComponent */])
    ], HttpClientComponent.prototype, "httpResponse", void 0);
    HttpClientComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-http-client',
            template: __webpack_require__(512)
        }),
        __metadata("design:paramtypes", [])
    ], HttpClientComponent);
    return HttpClientComponent;
}());



/***/ }),

/***/ 322:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpRequestComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__http_response_http_response_component__ = __webpack_require__(111);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__http_client_service__ = __webpack_require__(320);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var HttpRequestComponent = /** @class */ (function () {
    function HttpRequestComponent(httpClient, dialog) {
        this.httpClient = httpClient;
        this.dialog = dialog;
        this.RequestStatus = __WEBPACK_IMPORTED_MODULE_2__requestViews__["b" /* RequestStatus */];
    }
    HttpRequestComponent.prototype.ngOnInit = function () {
        this.httpMethods = [
            'GET',
            'POST',
            'PUT',
            'PATCH',
            'DELETE',
            'HEAD',
            'OPTIONS'
        ];
        this.headerBuilders = this.requestExpansions.map(function (re) { return re.headerBuilders; });
        this.urlParamBuilders = this.requestExpansions.map(function (re) { return re.urlParamBuilders; });
        this.queryParamBuilders = this.requestExpansions.map(function (re) { return re.queryParamBuilders; });
        this.reqBodyBuilders = this.requestExpansions.map(function (re) { return re.bodyBuilders; });
    };
    HttpRequestComponent.prototype.send = function () {
        var _this = this;
        console.log('send!');
        var cleanedUrl = this.cleanRequestUrl(this.requestView.requestUrl);
        console.log('@@@: ' + this.requestView.requestUrl);
        this.requestView.requestUrl = cleanedUrl;
        var fianlRequestUrl = this.makeFinalRequestUrl(cleanedUrl);
        var body = this.requestView.request.body;
        var method = this.requestView.request.method;
        var requestHeaders = this.requestView.request.headers.filter(function (h) { return h.enabled; });
        this.requestView.request.url = fianlRequestUrl;
        this.requestView.requestStatus = __WEBPACK_IMPORTED_MODULE_2__requestViews__["b" /* RequestStatus */].Sending;
        this.requestView.response = new __WEBPACK_IMPORTED_MODULE_2__requestViews__["d" /* ResponseInfo */]();
        this.requestView.resBodyFormat = false;
        this.requestView.resBodyWrap = true;
        this.httpClient.execute2(method, fianlRequestUrl, requestHeaders, body)
            .subscribe(function (response) { return _this.httpResponse.handleResponse(response); }, function (error) { return _this.httpResponse.handleError(error); });
        // .subscribe(response => this.httpResponse.handleResponse(response));
    };
    HttpRequestComponent.prototype.cleanRequestUrl = function (dirtyUrl) {
        if (dirtyUrl == null) {
            return '';
        }
        return dirtyUrl.replace('\n', '');
    };
    HttpRequestComponent.prototype.makeFinalRequestUrl = function (rawUrl) {
        var fianlRequestUrl;
        var url = rawUrl;
        if (url.indexOf('}') < 0) {
            fianlRequestUrl = url;
        }
        else {
            var uri_1 = url;
            var queryString_1 = '';
            var qIndex = url.indexOf('?');
            console.log(qIndex);
            if (qIndex > -1) {
                uri_1 = url.substring(0, qIndex);
                queryString_1 = url.substring(qIndex + 1, url.length);
            }
            // if (uri != null) {
            this.requestView.request.urlParams
                .filter(function (nameValue) { return nameValue.enabled; })
                .forEach(function (nameValue) {
                var value = nameValue.value === undefined ? '' : nameValue.value;
                uri_1 = uri_1.replace('{' + nameValue.name + '}', value);
            });
            // }
            // if (queryString != null) {
            this.requestView.request.queryParams
                .filter(function (nameValue) { return nameValue.enabled; })
                .forEach(function (nameValue) {
                queryString_1 = queryString_1.replace('{' + nameValue.name + '}', nameValue.value);
            });
            // }
            fianlRequestUrl = uri_1;
            if (queryString_1 !== '') {
                fianlRequestUrl = fianlRequestUrl + '?' + queryString_1;
            }
        }
        return fianlRequestUrl;
    };
    HttpRequestComponent.prototype.findParams = function ($event) {
        if ($event.key === 'Enter') {
            // TODO 더 좋은 방식으로 바꿔야 함
            this.requestView.requestUrl = this.requestView.requestUrl.substr(0, this.requestView.requestUrl.length - 1);
            this.send();
            return;
        }
        var url = this.requestView.requestUrl;
        if (url == null || '' === url) {
            return;
        }
        if ($event.key !== '}') {
            if (url.indexOf('}') < -1) {
                return;
            }
        }
        var uri = url;
        var queryString = '';
        var qIndex = url.indexOf('?');
        if (qIndex > 0) {
            uri = url.substring(0, qIndex);
            queryString = url.substring(qIndex + 1, url.length);
        }
        if (uri.length > 0) {
            if (this.findProperties(uri, this.requestView.request.urlParams)) {
                this.requestView.isOpenParams = true;
                this.requestView.paramTebSelectedIndex = 1;
            }
        }
        if (queryString !== '') {
            if (this.findProperties(queryString, this.requestView.request.queryParams)) {
                this.requestView.isOpenParams = true;
                this.requestView.paramTebSelectedIndex = 0;
            }
        }
    };
    HttpRequestComponent.prototype.findProperties = function (source, target) {
        var paramNames = new Array();
        var isStartParamName = false;
        var tempName = '';
        source.split('').forEach(function (s) {
            if (s === '{') {
                isStartParamName = true;
            }
            else if (s === '}') {
                isStartParamName = false;
                if (tempName !== '') {
                    paramNames.push(tempName);
                    tempName = '';
                }
            }
            else if (isStartParamName) {
                tempName += s;
            }
        });
        paramNames.forEach(function (name) {
            var exist = target.find(function (p) { return p.name === name; });
            if (!exist) {
                var param = target.pop();
                if (param !== undefined) {
                    param.name = name;
                    target.push(param);
                    target.push(new __WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */]());
                }
            }
        });
        if (paramNames.length > 0) {
            return true;
        }
        return false;
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */])
    ], HttpRequestComponent.prototype, "requestView", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", Array)
    ], HttpRequestComponent.prototype, "requestExpansions", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_3__http_response_http_response_component__["a" /* HttpResponseComponent */])
    ], HttpRequestComponent.prototype, "httpResponse", void 0);
    HttpRequestComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-http-request',
            template: __webpack_require__(513),
            providers: [__WEBPACK_IMPORTED_MODULE_4__http_client_service__["a" /* HttpClientService */]]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_4__http_client_service__["a" /* HttpClientService */], __WEBPACK_IMPORTED_MODULE_1__angular_material__["q" /* MatDialog */]])
    ], HttpRequestComponent);
    return HttpRequestComponent;
}());



/***/ }),

/***/ 323:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpClientConfig; });
/* unused harmony export DefinedRequestInfo */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__requestViews__ = __webpack_require__(25);

/**
 * http client 의 설정 정보
 */
var HttpClientConfig = /** @class */ (function () {
    function HttpClientConfig() {
    }
    return HttpClientConfig;
}());

/**
 * 미리 정의된 request 정보, http client 를 생성하자마자 입력된 값을 보여주려고 할때 사용
 * 여기에 지정된 내용들은 기본적으로 client 에서 지우거나 수정할 수 없다.
 */
var DefinedRequestInfo = /** @class */ (function () {
    function DefinedRequestInfo() {
        this.method = 'GET';
        this.queryParams = [new __WEBPACK_IMPORTED_MODULE_0__requestViews__["c" /* NameValue */]()];
        this.urlParams = [new __WEBPACK_IMPORTED_MODULE_0__requestViews__["c" /* NameValue */]()];
        this.headers = [new __WEBPACK_IMPORTED_MODULE_0__requestViews__["c" /* NameValue */]()];
    }
    return DefinedRequestInfo;
}());



/***/ }),

/***/ 324:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HttpClientsPreference; });
/* unused harmony export HttpClientConfig */
/* unused harmony export DefinedRequestInfo */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__requestViews__ = __webpack_require__(25);
/**
 * http client tab 전체를 관리하는 환경 설정 값 객체
 */

var HttpClientsPreference = /** @class */ (function () {
    function HttpClientsPreference() {
        /**
         * 허용하는 탭의 최대 갯수
         */
        this.maxClientTabCount = 10;
        // definedMethods: Array<string> = new Array();
        // definedHeaders: Array<Header> = new Array();
        // addAllDefaultStatus() {
        //     this.definedMethods.push('GET');
        //     this.definedMethods.push('POST');
        //     this.definedMethods.push('PUT');
        //     this.definedMethods.push('PATCH');
        //     this.definedMethods.push('DELETE');
        //     this.definedMethods.push('OPTIONS');
        //     this.definedHeaders.push(new Header('Accept', null));
        // }
    }
    return HttpClientsPreference;
}());

/**
 * http client 의 설정 정보
 */
var HttpClientConfig = /** @class */ (function () {
    function HttpClientConfig() {
    }
    return HttpClientConfig;
}());

// export class Header {
//     name: string;
//     values: Array<string>;
//     constructor(name: string, values: Array<string>) {
//         this.name = name;
//         this.values = values;
//     }
// }
// export class Status {
//     code: number;
//     text: string;
//     description: string;
// }
/**
 * 미리 정의된 request 정보, http client 를 생성하자마자 입력된 값을 보여주려고 할때 사용
 * 여기에 지정된 내용들은 기본적으로 client 에서 지우거나 수정할 수 없다.
 */
var DefinedRequestInfo = /** @class */ (function () {
    function DefinedRequestInfo() {
        this.method = 'GET';
        this.queryParams = [new __WEBPACK_IMPORTED_MODULE_0__requestViews__["c" /* NameValue */]()];
        this.urlParams = [new __WEBPACK_IMPORTED_MODULE_0__requestViews__["c" /* NameValue */]()];
        this.headers = [new __WEBPACK_IMPORTED_MODULE_0__requestViews__["c" /* NameValue */]()];
    }
    return DefinedRequestInfo;
}());



/***/ }),

/***/ 325:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__mint_client_module__ = __webpack_require__(326);
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return __WEBPACK_IMPORTED_MODULE_0__mint_client_module__["a"]; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__requestViews__ = __webpack_require__(25);
/* unused harmony reexport RequestView */




/***/ }),

/***/ 326:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MintClientModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common__ = __webpack_require__(5);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_flex_layout__ = __webpack_require__(155);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_forms__ = __webpack_require__(29);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_http__ = __webpack_require__(156);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6_ng2_ace_editor__ = __webpack_require__(502);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_brace_theme_idle_fingers__ = __webpack_require__(341);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7_brace_theme_idle_fingers___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_7_brace_theme_idle_fingers__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_brace_theme_dawn__ = __webpack_require__(340);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_brace_theme_dawn___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_8_brace_theme_dawn__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9_brace_mode_css__ = __webpack_require__(334);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9_brace_mode_css___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_9_brace_mode_css__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10_brace_mode_html__ = __webpack_require__(112);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10_brace_mode_html___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_10_brace_mode_html__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11_brace_mode_javascript__ = __webpack_require__(335);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11_brace_mode_javascript___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_11_brace_mode_javascript__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12_brace_mode_json__ = __webpack_require__(336);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12_brace_mode_json___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_12_brace_mode_json__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13_brace_mode_text__ = __webpack_require__(338);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13_brace_mode_text___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_13_brace_mode_text__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14_brace_mode_properties__ = __webpack_require__(337);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14_brace_mode_properties___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_14_brace_mode_properties__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15_brace_mode_xml__ = __webpack_require__(339);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15_brace_mode_xml___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_15_brace_mode_xml__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__expansions_authorization_basic_authorization_basic_component__ = __webpack_require__(163);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__expansions_text_html_viewer_text_html_viewer_component__ = __webpack_require__(110);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__expansions_text_plain_text_plain_component__ = __webpack_require__(164);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__expansions_xwww_form_urlencoded_xwww_form_urlencoded_component__ = __webpack_require__(165);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__http_client_http_client_component__ = __webpack_require__(321);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__http_client_tab_http_client_tab_component__ = __webpack_require__(166);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_22__builder_dialog_builder_dialog_component__ = __webpack_require__(109);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_23__response_body_basic_response_body_basic_component__ = __webpack_require__(168);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_24__http_request_http_request_component__ = __webpack_require__(322);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_25__http_response_http_response_component__ = __webpack_require__(111);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_26__name_values_name_values_component__ = __webpack_require__(327);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_27__request_body_request_body_component__ = __webpack_require__(328);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};






// import { AceEditorDirective } from 'ng2-ace';























var MintClientModule = /** @class */ (function () {
    function MintClientModule() {
    }
    MintClientModule = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["y" /* NgModule */])({
            declarations: [
                // AceEditorDirective,
                __WEBPACK_IMPORTED_MODULE_22__builder_dialog_builder_dialog_component__["a" /* BuilderDialogComponent */],
                __WEBPACK_IMPORTED_MODULE_24__http_request_http_request_component__["a" /* HttpRequestComponent */],
                __WEBPACK_IMPORTED_MODULE_25__http_response_http_response_component__["a" /* HttpResponseComponent */],
                __WEBPACK_IMPORTED_MODULE_16__expansions_authorization_basic_authorization_basic_component__["a" /* AuthorizationBasicComponent */],
                __WEBPACK_IMPORTED_MODULE_26__name_values_name_values_component__["a" /* NameValuesComponent */],
                __WEBPACK_IMPORTED_MODULE_19__expansions_xwww_form_urlencoded_xwww_form_urlencoded_component__["a" /* XWwwFormUrlencodedComponent */],
                __WEBPACK_IMPORTED_MODULE_27__request_body_request_body_component__["a" /* RequestBodyComponent */],
                __WEBPACK_IMPORTED_MODULE_18__expansions_text_plain_text_plain_component__["a" /* TextPlainComponent */],
                __WEBPACK_IMPORTED_MODULE_20__http_client_http_client_component__["a" /* HttpClientComponent */],
                __WEBPACK_IMPORTED_MODULE_21__http_client_tab_http_client_tab_component__["a" /* HttpClientTabComponent */],
                __WEBPACK_IMPORTED_MODULE_23__response_body_basic_response_body_basic_component__["a" /* ResponseBodyBasicComponent */],
                __WEBPACK_IMPORTED_MODULE_25__http_response_http_response_component__["b" /* BodyViewerHostDirective */],
                __WEBPACK_IMPORTED_MODULE_17__expansions_text_html_viewer_text_html_viewer_component__["a" /* TextHtmlViewerComponent */],
                __WEBPACK_IMPORTED_MODULE_17__expansions_text_html_viewer_text_html_viewer_component__["b" /* SafeHtmlPipe */]
            ],
            entryComponents: [
                __WEBPACK_IMPORTED_MODULE_16__expansions_authorization_basic_authorization_basic_component__["a" /* AuthorizationBasicComponent */],
                __WEBPACK_IMPORTED_MODULE_22__builder_dialog_builder_dialog_component__["a" /* BuilderDialogComponent */],
                __WEBPACK_IMPORTED_MODULE_18__expansions_text_plain_text_plain_component__["a" /* TextPlainComponent */],
                __WEBPACK_IMPORTED_MODULE_19__expansions_xwww_form_urlencoded_xwww_form_urlencoded_component__["a" /* XWwwFormUrlencodedComponent */],
                __WEBPACK_IMPORTED_MODULE_23__response_body_basic_response_body_basic_component__["a" /* ResponseBodyBasicComponent */],
                __WEBPACK_IMPORTED_MODULE_17__expansions_text_html_viewer_text_html_viewer_component__["a" /* TextHtmlViewerComponent */]
            ],
            exports: [
                __WEBPACK_IMPORTED_MODULE_20__http_client_http_client_component__["a" /* HttpClientComponent */],
                __WEBPACK_IMPORTED_MODULE_21__http_client_tab_http_client_tab_component__["a" /* HttpClientTabComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_common__["e" /* CommonModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_flex_layout__["a" /* FlexLayoutModule */],
                __WEBPACK_IMPORTED_MODULE_3__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_http__["a" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_6_ng2_ace_editor__["a" /* AceEditorModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["a" /* MatButtonModule */],
                // MatButtonToggleModule,
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["f" /* MatCheckboxModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["g" /* MatDialogModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["b" /* MatIconModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["h" /* MatInputModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["c" /* MatMenuModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["i" /* MatProgressBarModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["j" /* MatRadioModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["k" /* MatSelectModule */],
                // MatSidenavModule,
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["l" /* MatSnackBarModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["e" /* MatTabsModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_material__["m" /* MatTooltipModule */]
            ]
        })
    ], MintClientModule);
    return MintClientModule;
}());



/***/ }),

/***/ 327:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NameValuesComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__builder_dialog_builder_dialog_component__ = __webpack_require__(109);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_util__ = __webpack_require__(151);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_util___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_util__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var NameValuesComponent = /** @class */ (function () {
    function NameValuesComponent(dialog) {
        this.dialog = dialog;
    }
    NameValuesComponent.prototype.ngOnInit = function () {
        if (this.nameValueBuilders == null) {
            this.nameValueBuilders = new Array();
        }
        if (this.nameValues == null) {
            this.nameValues = new Array();
        }
    };
    NameValuesComponent.prototype.findBuilder = function (selectedIndex) {
        var header = this.nameValues[selectedIndex];
        if (header.name == null) {
            // TODO 에러 처리
            return;
        }
        var headerName = header.name.toLowerCase();
        var headerBuilder = this.nameValueBuilders.find(function (b) { return !__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_4_util__["isUndefined"])(b.get(headerName)); });
        if (headerBuilder != null) {
            this.nameValues[selectedIndex].enableBuilder = true;
        }
        else {
            this.nameValues[selectedIndex].enableBuilder = false;
        }
    };
    NameValuesComponent.prototype.openBuilder = function (selectedIndex) {
        var _this = this;
        var header = this.nameValues[selectedIndex];
        if (header.name == null) {
            // TODO 에러 처리
            return;
        }
        var headerName = header.name.toLowerCase();
        var matchedHeaderBuilders = this.nameValueBuilders
            .filter(function (builder) { return !__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_4_util__["isUndefined"])(builder.get(headerName)); })
            .map(function (builder) { return builder.get(headerName); });
        this.dialog.open(__WEBPACK_IMPORTED_MODULE_3__builder_dialog_builder_dialog_component__["a" /* BuilderDialogComponent */], {
            data: {
                title: header.name + ' Builder Select',
                expanders: matchedHeaderBuilders,
                selectedExpander: this.nameValues[selectedIndex].selectedExpander
            }
        })
            .afterClosed()
            .subscribe(function (data) {
            if (data != null) {
                if (data.value != null) {
                    header.value = data.value;
                    _this.nameValues[selectedIndex].selectedExpander = data.selectedExpander;
                    _this.addNameValue(selectedIndex);
                }
            }
        });
    };
    NameValuesComponent.prototype.addNameValue = function (selectedIndex) {
        if (selectedIndex === this.nameValues.length - 1) {
            this.nameValues.push(new __WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */]());
        }
    };
    NameValuesComponent.prototype.optimize = function () {
        var length = this.nameValues.length;
        if (length <= 1) {
            return;
        }
        var lastNameValue = this.nameValues[length - 1];
        var prevLastNameValue = this.nameValues[length - 2];
        if (this.isEmpty(lastNameValue) && this.isEmpty(prevLastNameValue)) {
            this.nameValues.pop();
        }
    };
    NameValuesComponent.prototype.isEmpty = function (nameValue) {
        if (nameValue.value == null || nameValue.value === '') {
            if (nameValue.name == null || nameValue.name === '') {
                return true;
            }
        }
        return false;
    };
    /**
     * 선택된 항목을 배열에서 삭제
     * @param selectedIndex
     */
    NameValuesComponent.prototype.remove = function (selectedIndex) {
        this.nameValues.splice(selectedIndex, 1);
    };
    NameValuesComponent.prototype.disabled = function (selectedIndex) {
        var selectedNameValue = this.nameValues[selectedIndex];
        selectedNameValue.enabled = false;
    };
    NameValuesComponent.prototype.enabled = function (selectedIndex) {
        var selectedNameValue = this.nameValues[selectedIndex];
        selectedNameValue.enabled = true;
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", Array)
    ], NameValuesComponent.prototype, "nameValueBuilders", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", Array)
    ], NameValuesComponent.prototype, "nameValues", void 0);
    NameValuesComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-name-values',
            template: __webpack_require__(515),
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["q" /* MatDialog */]])
    ], NameValuesComponent);
    return NameValuesComponent;
}());



/***/ }),

/***/ 328:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return RequestBodyComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_material__ = __webpack_require__(42);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__requestViews__ = __webpack_require__(25);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__builder_dialog_builder_dialog_component__ = __webpack_require__(109);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var RequestBodyComponent = /** @class */ (function () {
    function RequestBodyComponent(dialog) {
        this.dialog = dialog;
        this.suggestedDisplayModes = new Map();
    }
    RequestBodyComponent.prototype.ngOnInit = function () {
        this.contentTypes = [
            'application/json',
            'application/xml',
            'application/x-www-form-urlencoded',
            'multipart/form-data',
            'text/html',
            'text/plain'
        ];
        this.displayModes = [
            'css',
            'html',
            'javascript',
            'json',
            'text',
            'properties',
            'xml'
        ];
        this.suggestedDisplayModes.set('application/json', 'json');
        this.suggestedDisplayModes.set('application/xml', 'xml');
        this.suggestedDisplayModes.set('application/x-www-form-urlencoded', 'text');
        this.suggestedDisplayModes.set('multipart/form-data', 'text');
        this.suggestedDisplayModes.set('text/html', 'html');
        this.suggestedDisplayModes.set('text/plain', 'properties');
    };
    RequestBodyComponent.prototype.onChange = function (data) {
        console.log('onChange');
        this.requestView.request.body = data;
    };
    RequestBodyComponent.prototype.onChangeRequestBodyContentType = function () {
        var reqContentType = this.requestView.reqContentType;
        var displayMode = this.suggestedDisplayModes.get(reqContentType);
        if (displayMode != null) {
            this.requestView.reqDisplayMode = displayMode;
        }
        else {
            this.requestView.reqDisplayMode = 'text';
        }
        var reqBodyBuilder = this.reqBodyBuilders.find(function (builder) { return builder.has(reqContentType); });
        if (reqBodyBuilder !== undefined) {
            this.requestView.enableReqBodyBuilder = true;
        }
        else {
            this.requestView.enableReqBodyBuilder = false;
        }
        var contentTypeHeader = this.requestView.request.headers
            .find(function (h) { return h.name.toLowerCase() === 'content-type'; });
        if (contentTypeHeader != null) {
            contentTypeHeader.value = reqContentType;
        }
        else {
            this.requestView.request.headers.pop();
            this.requestView.request.headers.push(new __WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */]('Content-Type', reqContentType));
            this.requestView.request.headers.push(new __WEBPACK_IMPORTED_MODULE_2__requestViews__["c" /* NameValue */]());
        }
    };
    RequestBodyComponent.prototype.openReqBodyBuilder = function () {
        var _this = this;
        var reqContentType = this.requestView.reqContentType;
        var matchedBuilders = this.reqBodyBuilders
            .filter(function (builder) { return builder.has(reqContentType); })
            .map(function (builder) { return builder.get(reqContentType); });
        this.dialog.open(__WEBPACK_IMPORTED_MODULE_3__builder_dialog_builder_dialog_component__["a" /* BuilderDialogComponent */], {
            data: {
                title: 'Request Body Builder Select',
                expanders: matchedBuilders,
                selectedExpander: this.selectedReqBodyExpander
            }
        }).afterClosed()
            .subscribe(function (data) {
            if (data != null) {
                if (data.value != null) {
                    _this.requestView.request.body = data.value;
                    _this.selectedReqBodyExpander = data.selectedExpander;
                }
            }
        });
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", __WEBPACK_IMPORTED_MODULE_2__requestViews__["a" /* RequestView */])
    ], RequestBodyComponent.prototype, "requestView", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["N" /* Input */])(),
        __metadata("design:type", Array)
    ], RequestBodyComponent.prototype, "reqBodyBuilders", void 0);
    RequestBodyComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-request-body',
            template: __webpack_require__(516),
            styles: [__webpack_require__(639)]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_material__["q" /* MatDialog */]])
    ], RequestBodyComponent);
    return RequestBodyComponent;
}());



/***/ }),

/***/ 329:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__module__ = __webpack_require__(330);
/* harmony reexport (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return __WEBPACK_IMPORTED_MODULE_0__module__["a"]; });



/***/ }),

/***/ 330:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MyLibModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common__ = __webpack_require__(5);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__my_lib_service__ = __webpack_require__(169);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__my_lib_component__ = __webpack_require__(331);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};




var MyLibModule = /** @class */ (function () {
    function MyLibModule() {
    }
    MyLibModule = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["y" /* NgModule */])({
            declarations: [__WEBPACK_IMPORTED_MODULE_3__my_lib_component__["a" /* MyLibComponent */]],
            imports: [__WEBPACK_IMPORTED_MODULE_1__angular_common__["e" /* CommonModule */]],
            exports: [__WEBPACK_IMPORTED_MODULE_3__my_lib_component__["a" /* MyLibComponent */]],
            providers: [__WEBPACK_IMPORTED_MODULE_2__my_lib_service__["a" /* MyLibService */]]
        })
    ], MyLibModule);
    return MyLibModule;
}());



/***/ }),

/***/ 331:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MyLibComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(1);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__my_lib_service__ = __webpack_require__(169);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MyLibComponent = /** @class */ (function () {
    function MyLibComponent(myLibService) {
        this.myLibService = myLibService;
    }
    MyLibComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_10" /* Component */])({
            selector: 'app-my-lib',
            template: __webpack_require__(518),
            styles: [__webpack_require__(632)]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__my_lib_service__["a" /* MyLibService */]])
    ], MyLibComponent);
    return MyLibComponent;
}());



/***/ }),

/***/ 490:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports
exports.i(__webpack_require__(489), "");

// module
exports.push([module.i, "/* this file will be extracted to main dist folder and is imported in index.html */\n/* This file is for setting global styles  */\nbody {\n  margin: 0px 0px 0px 0px;\n  background-color: #f2f4f6; }\n\n.content {\n  background-color: #ffffff; }\n\n.content-container {\n  /*padding-right: 10px;*/\n  /*padding-left: 10px;*/\n  padding-bottom: 10px;\n  margin-right: auto;\n  margin-left: auto; }\n\n@media (max-width: 960px) {\n  .content-container {\n    padding-right: 0px;\n    padding-left: 0px;\n    margin-right: auto;\n    margin-left: auto; } }\n\n@media (min-width: 600px) {\n  .content-container {\n    max-width: 590px; } }\n\n@media (min-width: 960px) {\n  .content-container {\n    max-width: 950px; } }\n\n@media (min-width: 1280px) {\n  .content-container {\n    max-width: 1270px; } }\n\n@media (min-width: 1920px) {\n  .content-container {\n    max-width: 1910px; } }\n", ""]);

// exports


/***/ }),

/***/ 491:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, ".my-lib {\n  font-size: 32px;\n  color: red; }\n", ""]);

// exports


/***/ }),

/***/ 492:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/***/ }),

/***/ 493:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "/*styles for home content only*/", ""]);

// exports


/***/ }),

/***/ 494:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "/*h1 {*/\n  /*color: #00BCD4;*/\n/*}*/", ""]);

// exports


/***/ }),

/***/ 495:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/***/ }),

/***/ 496:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, ".html-viewer {\n    min-height: 400px;\n}", ""]);

// exports


/***/ }),

/***/ 497:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/***/ }),

/***/ 498:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/***/ }),

/***/ 499:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/***/ }),

/***/ 500:
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__(36)(undefined);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/***/ }),

/***/ 505:
/***/ (function(module, exports) {

module.exports = "<div>\n  <h1 class=\"sample-content\">Your Content Here</h1>\n\n  <hr>\n\n  <h1>{{value}}</h1>\n  <div>\n    For hot module reloading run\n    <pre>npm run start:hmr</pre>\n  </div>\n\n  <hr>\n\n  <div>\n    <h4>Local State</h4>\n\n    <form (ngSubmit)=\"submitState(localState.value)\" autocomplete=\"off\">\n\n      <input\n        [value]=\"localState.value\"\n        (input)=\"localState.value = $event.target.value\"\n        placeholder=\"Submit Local State to App State\"\n        autofocus>\n\n      <button>Submit Value</button>\n    </form>\n    <!--\n        <input type=\"text\" [value]=\"localState.value\" (input)=\"localState.value = $event.target.value\" autofocus>\n        Rather than wiring up two-way data-binding ourselves with [value] and (input)\n        we can use Angular's [(ngModel)] syntax\n        <input type=\"text\" name=\"textInput\" [(ngModel)]=\"localState.value\" autofocus>\n      -->\n\n    <pre>this.localState = {{ localState | json }}</pre>\n\n    <app-my-lib></app-my-lib>\n  </div>\n\n</div>\n"

/***/ }),

/***/ 506:
/***/ (function(module, exports) {

module.exports = "<h1 mat-dialog-title>{{expanderView.title}}</h1>\n\n<div mat-dialog-content>\n  <mat-select\n    fxFlex\n    placeholder=\"{{expanderView.name}} select\"\n    [(ngModel)]=\"expanderView.selectedExpander\">\n    <mat-option [value]=\"\">No Select</mat-option>\n    <mat-option *ngFor=\"let expander of expanderView.expanders\" [value]=\"expander\">{{expander.name}}</mat-option>\n  </mat-select>\n</div>\n\n<div mat-dialog-actions fxLayoutGap=\"1em\">\n  <button mat-raised-button color=\"accent\" [disabled]=\"expanderView.selectedExpander == null\" (click)=\"openBuilder()\">Select</button>\n  <button mat-raised-button (click)=\"close()\">Cancle</button>\n</div>\n"

/***/ }),

/***/ 507:
/***/ (function(module, exports) {

module.exports = "<h1 mat-dialog-title>Basic Auth</h1>\n\n<div mat-dialog-content>\n  <div>\n    <mat-input-container>\n      <input mdInput placeholder=\"Username\" [(ngModel)]=\"basicAuthView.username\" />\n    </mat-input-container>\n  </div>\n  <div>\n  <mat-input-container>\n    <input mdInput placeholder=\"Password\" [(ngModel)]=\"basicAuthView.password\" />\n  </mat-input-container>\n  </div>\n</div>\n\n<div mat-dialog-actions fxLayoutGap=\"1em\">\n  <button mat-raised-button color=\"accent\" (click)=\"apply()\">apply</button>\n  <button mat-raised-button (click)=\"close()\">cancle</button>\n</div>\n"

/***/ }),

/***/ 508:
/***/ (function(module, exports) {

module.exports = "<div [innerHTML]=\"requestView.response.body | safeHtml\" class=\"html-viewer\"></div>\n"

/***/ }),

/***/ 509:
/***/ (function(module, exports) {

module.exports = "<h1 mat-dialog-title>Form text/plain</h1>\n\n<div mat-dialog-content>\n  <app-name-values [nameValues]=\"formDatas\"></app-name-values>\n</div>\n\n<div mat-dialog-actions fxLayoutGap=\"1em\">\n  <button mat-raised-button color=\"accent\" (click)=\"apply()\">apply</button>\n  <button mat-raised-button (click)=\"close()\">cancle</button>\n</div>\n"

/***/ }),

/***/ 510:
/***/ (function(module, exports) {

module.exports = "<h1 mat-dialog-title>Form xwww-form-urlencoded</h1>\n\n<div mat-dialog-content>\n  <app-name-values [nameValues]=\"formDatas\"></app-name-values>\n</div>\n\n<div mat-dialog-actions fxLayoutGap=\"1em\">\n  <button mat-raised-button color=\"accent\" (click)=\"apply()\">apply</button>\n  <button mat-raised-button (click)=\"close()\">cancle</button>\n</div>\n"

/***/ }),

/***/ 511:
/***/ (function(module, exports) {

module.exports = "<mat-tab-group dynamicHeight=\"true\" [selectedIndex]=\"selectedIndex\">\n\t<mat-tab *ngFor=\"let requestView of requestViews; index as i\">\n\t\t<ng-template mat-tab-label>\n\t\t\t<div>\n\t\t\t\t{{requestView.title}}\n\t\t\t\t<button mat-icon-button [matMenuTriggerFor]=\"menu\">\n\t\t\t\t\t<mat-icon>more_vert</mat-icon>\n\t\t\t\t</button>\n\t\t\t\t<mat-menu #menu=\"matMenu\">\n\t\t\t\t\t<button mat-menu-item (click)=\"duplicateClient(i)\">\n\t\t\t\t\t\t<mat-icon>content_copy</mat-icon>\n\t\t\t\t\t\t<span>Duplicate</span>\n\t\t\t\t\t\t{{menu.menu}}\n\t\t\t\t\t</button>\n\t\t\t\t\t<button mat-menu-item (click)=\"closeClient(i)\" *ngIf=\"requestViews.length > 1\">\n\t\t\t\t\t\t<mat-icon>close</mat-icon>\n\t\t\t\t\t\t<span>Close</span>\n\t\t\t\t\t</button>\n\t\t\t\t</mat-menu>\n\t\t\t</div>\n\t\t</ng-template>\n\t\t<div fxLayout=\"column\" style=\"padding: 0.5em 1em 0.5em 1em\">\n\t\t\t<app-http-client [requestView]=\"requestView\" [requestExpansions]=\"requestExpansions\"></app-http-client>\n\t\t</div>\n\t</mat-tab>\n</mat-tab-group>\n"

/***/ }),

/***/ 512:
/***/ (function(module, exports) {

module.exports = "<app-http-request\n  [requestView]=\"requestView\"\n  [requestExpansions]=\"requestExpansions\"\n  [httpResponse]=\"httpResponse\"></app-http-request>\n\n<app-http-response [requestView]=\"requestView\" [requestExpansions]=\"requestExpansions\"></app-http-response>"

/***/ }),

/***/ 513:
/***/ (function(module, exports) {

module.exports = "<div fxLayout=\"column\">\n  <div fxLayoutGap=\"0.5em\" fxLayout.gt-sm=\"row\" fxLayout=\"column\"\n       fxLayoutAlign.gt-sm=\" center\">\n    <mat-form-field>\n      <mat-select [(ngModel)]=\"requestView.request.method\" placeholder=\"request method\">\n        <mat-option *ngFor=\"let method of httpMethods\" [value]=\"method\">{{method}}</mat-option>\n      </mat-select>\n    </mat-form-field>\n    <mat-form-field fxFlex fxFlexFill>\n      <!-- <input\n        mdInput\n        [(ngModel)]=\"requestView.requestUrl\"\n        (keyup)=\"findParams($event)\"\n        placeholder=\"Request URL\"\n        mdTooltip=\"reuqest url에서 property holder 를 {...}와 같은 형식으로 사용할 수 있습니다.\" /> -->\n      <textarea matInput\n                matTextareaAutosize\n                [(ngModel)]=\"requestView.requestUrl\"\n                (keyup)=\"findParams($event)\"\n                placeholder=\"Request URL\"\n                matTooltip=\"reuqest url에서 property holder 를 {...}와 같은 형식으로 사용할 수 있습니다.\"></textarea>\n    </mat-form-field>\n    <button mat-button (click)=\"requestView.isOpenParams = !requestView.isOpenParams\" [disabled]=\"requestView.requestStatus == RequestStatus.Sending\">\n      Params\n      <mat-icon *ngIf=\"requestView.isOpenParams\">expand_less</mat-icon>\n      <mat-icon *ngIf=\"!requestView.isOpenParams\">expand_more</mat-icon>\n    </button>\n    <button mat-raised-button color=\"primary\" (click)=\"send()\" [disabled]=\"requestView.requestStatus == RequestStatus.Sending\">Send</button>\n  </div>\n  <div style=\"background-color: #f2f4f6; padding: 0.5em\" *ngIf=\"requestView.isOpenParams\">\n\n    <mat-tab-group [selectedIndex]=\"requestView.paramTebSelectedIndex\">\n      <mat-tab>\n        <ng-template mat-tab-label>\n          Query\n          <span *ngIf=\"requestView.request.queryParams.length > 1\">\n            ({{requestView.request.queryParams.length - 1}})\n          </span>\n        </ng-template>\n        <div style=\"padding: 0.5em\">\n          <app-name-values [nameValues]=\"requestView.request.queryParams\" [nameValueBuilders]=\"queryParamBuilders\"></app-name-values>\n        </div>\n      </mat-tab>\n      <mat-tab>\n        <ng-template mat-tab-label>\n          Url\n          <span *ngIf=\"requestView.request.urlParams.length > 1\">\n            ({{requestView.request.urlParams.length - 1}})\n          </span>\n        </ng-template>\n        <div style=\"padding: 0.5em\">\n          <app-name-values [nameValues]=\"requestView.request.urlParams\" [nameValueBuilders]=\"urlParamBuilders\"></app-name-values>\n        </div>\n      </mat-tab>\n    </mat-tab-group>\n  </div>\n\n  <mat-tab-group>\n    <mat-tab>\n      <ng-template mat-tab-label>\n        <span fxLayoutAlign=\"center center\">\n          Body\n          <mat-icon *ngIf=\"requestView.request.body != '' && requestView.request.body != null\">\n            done\n          </mat-icon>\n        </span>\n      </ng-template>\n      <div fxLayoutGap=\"1em\" fxLayout=\"column\" style=\"padding: 1em 0.5em 0.5em;\">\n        <app-request-body [requestView]=\"requestView\" [reqBodyBuilders]=\"reqBodyBuilders\"></app-request-body>\n      </div>\n    </mat-tab>\n    <mat-tab>\n      <ng-template mat-tab-label>\n        Headers\n        <span *ngIf=\"requestView.request.headers.length > 1\">\n          ({{requestView.request.headers.length - 1}})\n        </span>\n      </ng-template>\n      <div style=\"padding: 0.5em\">\n        <app-name-values [nameValues]=\"requestView.request.headers\" [nameValueBuilders]=\"headerBuilders\"></app-name-values>\n      </div>\n    </mat-tab>\n  </mat-tab-group>\n</div>\n"

/***/ }),

/***/ 514:
/***/ (function(module, exports) {

module.exports = "<p *ngIf=\"requestView.requestStatus == RequestStatus.PreSend\">\n  please hit the\n  <button mat-raised-button color=\"primary\">Send</button>\n  button to get a response\n</p>\n\n<div *ngIf=\"requestView.requestStatus == RequestStatus.SendFail\">\n  <h2>Could not get any response</h2>\n  There was an error connecting to <a href=\"{{requestView.request.url}}\">{{requestView.request.url}}</a>\n</div>\n\n<div *ngIf=\"requestView.requestStatus == RequestStatus.Sending\">\n  <h1>\n    Sending... <button mat-raised-button>Cancel...</button>\n  </h1>\n  <mat-progress-bar mode=\"indeterminate\"></mat-progress-bar>\n</div>\n\n<div *ngIf=\"requestView.requestStatus == RequestStatus.SendSuccess\" fxLayout=\"column\" fxLayoutGap=\"1em\">\n  <b>Response</b>\n  <mat-toolbar>\n    <div fxLayout=\"row\" fxLayoutGap=\"1em\">\n      <span>\n        <b>Status: </b> {{requestView.response.status}} {{requestView.response.statusText}}\n      </span>\n      <span>\n        <b>elapse time: </b> {{requestView.response.elapseTime | number}} ms\n      </span>\n    </div>\n  </mat-toolbar>\n\n  <mat-tab-group dynamicHeight=\"true\">\n    <mat-tab>\n      <ng-template mat-tab-label>\n        <span fxLayoutAlign=\"center center\">\n          Body\n          <mat-icon *ngIf=\"requestView.response.body != '' && requestView.response.body != null\">\n            done\n          </mat-icon>\n        </span>\n      </ng-template>\n\n      <div fxLayoutGap=\"1em\" fxLayout=\"column\" style=\"padding: 0.5em;\">\n        <mat-radio-group *ngIf=\"matchedResBodyViewers.length > 1\"\n          fxLayoutGap=\"1em\"\n          [(ngModel)]=\"selectedBodyViewer\">\n          <mat-radio-button [value]=\"resBodyVeiwer\" *ngFor=\"let resBodyVeiwer of matchedResBodyViewers\">{{resBodyVeiwer.name}}</mat-radio-button>\n        </mat-radio-group>\n\n        <div\n          *ngFor=\"let resBodyVeiwer of matchedResBodyViewers\"\n          [hidden]=\"selectedBodyViewer != resBodyVeiwer\">\n          <ng-template body-viewer-host\n            [bodyViewer]=\"resBodyVeiwer\" [requestView]=\"requestView\"></ng-template>\n        </div>\n      </div>\n    </mat-tab>\n    <mat-tab>\n      <ng-template mat-tab-label>\n        Headers ({{requestView.response.headers.length}})\n      </ng-template>\n      <div style=\"padding: 0.5em\">\n        <p *ngFor=\"let header of requestView.response.headers\">\n          <b>{{header.name}}</b>: {{header.value}}\n        </p>\n      </div>\n    </mat-tab>\n  </mat-tab-group>\n</div>\n"

/***/ }),

/***/ 515:
/***/ (function(module, exports) {

module.exports = "<div fxLayoutGap=\"1em\" fxLayout=\"row\"\n  *ngFor=\"let nameValue of nameValues; index as i\"\n  (mouseenter)=\"nameValue.showCloseButton = true\"\n  (mouseleave)=\"nameValue.showCloseButton = false\">\n  <div fxLayoutGap=\"1em\" fxLayout=\"row\" fxFlex>\n    <mat-form-field fxFlex=\"30\">\n      <input matInput placeholder=\"Name\" [(ngModel)]=\"nameValue.name\"\n        [style.text-decoration]=\"!nameValue.enabled ? ' line-through' : ''\"\n        [style.color]=\"!nameValue.enabled ? 'gray' : 'black'\"\n        (focus)=\"addNameValue(i)\"\n        (keyup)=\"addNameValue(i);findBuilder(i)\"\n        (blur)=\"optimize()\" />\n    </mat-form-field>\n    <mat-form-field fxFlex>\n      <!-- <input mdInput placeholder=\"Value\" [(ngModel)]=\"nameValue.value\"\n      [style.text-decoration]=\"!nameValue.enabled ? ' line-through' : ''\"\n      (focus)=\"addNameValue(i)\"\n      (blur)=\"optimize()\" /> -->\n      <textarea matInput\n        matTextareaAutosize\n        placeholder=\"Value\"\n        [(ngModel)]=\"nameValue.value\"\n        [style.text-decoration]=\"!nameValue.enabled ? ' line-through' : ''\"\n        [style.color]=\"!nameValue.enabled ? 'gray' : 'black'\"\n        (focus)=\"addNameValue(i)\"\n        (blur)=\"optimize()\"></textarea>\n    </mat-form-field>\n  </div>\n  <!--<div>\n    <span fxFlex=\"30\">{{}}\n  </div>-->\n  <div fxFlexAlign=\"center\">\n    <button mat-raised-button color=\"accent\" *ngIf=\"nameValue.enableBuilder\" (click)=\"openBuilder(i)\">Build</button>\n\n    <button mat-icon-button [matMenuTriggerFor]=\"menu\">\n      <mat-icon>more_vert</mat-icon>\n    </button>\n    <mat-menu #menu=\"matMenu\">\n      <button mat-menu-item (click)=\"disabled(i)\" *ngIf=\"nameValue.enabled\">\n        <mat-icon>block</mat-icon>\n        <span>Disable</span>\n        {{menu.menu}}\n      </button>\n      <button mat-menu-item (click)=\"enabled(i)\" *ngIf=\"!nameValue.enabled\">\n        <mat-icon>redo</mat-icon>\n        <span>Enable</span>\n        {{menu.menu}}\n      </button>\n      <button mat-menu-item (click)=\"remove(i)\" *ngIf=\"nameValues.length > 1\">\n        <mat-icon>close</mat-icon>\n        <span>Remove</span>\n      </button>\n    </mat-menu>\n  </div>\n  <!--<div fxFlexAlign=\"center\" *ngIf=\"nameValue.showCloseButton && nameValues.length > 1\">\n    <button mat-icon-button (click)=\"remove(i)\">\n      <mat-icon>clear</mat-icon>\n    </button>\n  </div>-->\n</div>\n"

/***/ }),

/***/ 516:
/***/ (function(module, exports) {

module.exports = "<div fxLayout=\"column\">\n  <div fxLayoutGap=\"0.5em\" fxLayoutAlign=\"start center\">\n    <mat-checkbox [(ngModel)]=\"requestView.reqBodyWrap\">Wrap</mat-checkbox>\n    <mat-form-field>\n      <mat-select [(ngModel)]=\"requestView.reqDisplayMode\" placeholder=\"Syntax\">\n        <mat-option *ngFor=\"let method of displayModes\" [value]=\"method\">{{method}}</mat-option>\n      </mat-select>\n    </mat-form-field>\n    <mat-form-field>\n      <mat-select\n              [(ngModel)]=\"requestView.reqContentType\"\n              (change)=\"onChangeRequestBodyContentType()\"\n              placeholder=\"Content type\">\n        <mat-option>None</mat-option>\n        <mat-option *ngFor=\"let type of contentTypes\" [value]=\"type\">{{type}}</mat-option>\n      </mat-select>\n    </mat-form-field>\n    <button mat-raised-button color=\"accent\" *ngIf=\"requestView.enableReqBodyBuilder\" (click)=\"openReqBodyBuilder()\">Build</button>\n  </div>\n  <div ace-editor\n    [text]=\"requestView.request.body\"\n    [mode]=\"requestView.reqDisplayMode\"\n    [theme]=\"'dawn'\"\n    [options]=\"{\n      minLines: 10,\n      maxLines: '100',\n      showPrintMargin: false,\n      wrap: requestView.reqBodyWrap\n    }\"\n    (textChanged)=\"onChange($event)\"\n    style=\"display: block; width: 100%; height: 20vh;\"></div>\n</div>\n"

/***/ }),

/***/ 517:
/***/ (function(module, exports) {

module.exports = "<div fxLayoutGap=\"0.5em\" fxLayoutAlign=\"start center\">\n  <mat-checkbox [(ngModel)]=\"requestView.resBodyWrap\">Wrap</mat-checkbox>\n  <mat-form-field>\n    <mat-select [(ngModel)]=\"requestView.resDisplayMode\" placeholder=\"Syntax\">\n      <mat-option *ngFor=\"let method of displayModes\" [value]=\"method\">{{method}}</mat-option>\n    </mat-select>\n  </mat-form-field>\n  <mat-checkbox [(ngModel)]=\"requestView.resBodyFormat\" (change)=\"onChangeFormat()\">Format</mat-checkbox>\n</div>\n\n<div ace-editor\n  [text]=\"displayResBody\"\n  [mode]=\"requestView.resDisplayMode\"\n  [theme]=\"'dawn'\"\n  [readOnly]=\"true\"\n  [options]=\"{\n      minLines: 10,\n      maxLines: 'Infinity',\n      showPrintMargin: false,\n      wrap: requestView.resBodyWrap\n  }\"\n  style=\"display: block; width: 100%; height: 100%\"></div>\n"

/***/ }),

/***/ 518:
/***/ (function(module, exports) {

module.exports = "<span class=\"my-lib\">{{myLibService.myLib}}</span>"

/***/ }),

/***/ 629:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(490);
if(typeof content === 'string') content = [[module.i, content, '']];
// Prepare cssTransformation
var transform;

var options = {}
options.transform = transform
// add the styles to the DOM
var update = __webpack_require__(254)(content, options);
if(content.locals) module.exports = content.locals;
// Hot Module Replacement
if(false) {
	// When the styles change, update the <style> tags
	if(!content.locals) {
		module.hot.accept("!!../../../node_modules/css-loader/index.js!../../../node_modules/sass-loader/lib/loader.js!./styles.scss", function() {
			var newContent = require("!!../../../node_modules/css-loader/index.js!../../../node_modules/sass-loader/lib/loader.js!./styles.scss");
			if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
			update(newContent);
		});
	}
	// When the module is disposed, remove the <style> tags
	module.hot.dispose(function() { update(); });
}

/***/ }),

/***/ 630:
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__(494);
if(typeof content === 'string') content = [[module.i, content, '']];
// Prepare cssTransformation
var transform;

var options = {}
options.transform = transform
// add the styles to the DOM
var update = __webpack_require__(254)(content, options);
if(content.locals) module.exports = content.locals;
// Hot Module Replacement
if(false) {
	// When the styles change, update the <style> tags
	if(!content.locals) {
		module.hot.accept("!!../../../node_modules/css-loader/index.js!./headings.css", function() {
			var newContent = require("!!../../../node_modules/css-loader/index.js!./headings.css");
			if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
			update(newContent);
		});
	}
	// When the module is disposed, remove the <style> tags
	module.hot.dispose(function() { update(); });
}

/***/ }),

/***/ 632:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(491);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 633:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(492);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 634:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(493);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 635:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(495);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 636:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(496);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 637:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(497);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 638:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(498);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 639:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(499);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ }),

/***/ 640:
/***/ (function(module, exports, __webpack_require__) {


        var result = __webpack_require__(500);

        if (typeof result === "string") {
            module.exports = result;
        } else {
            module.exports = result.toString();
        }
    

/***/ })

},[318]);
//# sourceMappingURL=main.bundle.js.map